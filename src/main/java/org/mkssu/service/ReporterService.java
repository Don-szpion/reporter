package org.mkssu.service;

import org.mkssu.dao.entity.Student;
import org.mkssu.dao.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class ReporterService implements StudentRepository<Student>{

    @Override
    public Student findByName(String name) {
        Student student = new Student();
        student.setName("Tor");
        return student;
    }
}
