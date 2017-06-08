package org.mkssu.service;

import org.mkssu.dao.entity.Student;
import org.mkssu.dao.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReporterService {
    @Resource
    private StudentRepository repository;

    public Student findByName(String name) {
        return repository.findByName(name);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}
