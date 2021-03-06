package org.mkssu.dao.repository;

/**
 * Created by Don-Szpion on 04.06.2017.
 */
import org.mkssu.dao.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
    Student findByName(String name);
}
