package com.jmp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.jmp.entity.Student;

public interface StudentRepository extends ReactiveMongoRepository<Student, Integer> {
}
