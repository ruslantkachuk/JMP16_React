package com.jmp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.dto.StudentDto;
import com.jmp.entity.Student;
import com.jmp.enums.Level;
import com.jmp.repository.StudentRepository;

import reactor.core.publisher.Mono;

@Service
public class JmpService {

    @Autowired
    private StudentRepository repository;

    public Mono<StudentDto> saveStudent(Mono<StudentDto> studentMono) {
        return studentMono.log()
                .map(studentDto -> {
                    Student student = new Student();
                    BeanUtils.copyProperties(studentDto, student);
                    student.setLevel(Level.COLLEGE);
                    return student;
                }).doOnNext(repository::insert)
                .map(studentSaved -> {
                    StudentDto studentSavedDto = new StudentDto();
                    BeanUtils.copyProperties(studentSavedDto, studentSavedDto);
                    return studentSavedDto;
                });
    }

    public void transferStudent(Integer id) {
        repository.findById(id).subscribe(student -> student.setLevel(Level.UNIVERSITY));
    }
}
