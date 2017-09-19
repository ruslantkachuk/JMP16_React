package com.jmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.dto.StudentDto;
import com.jmp.service.JmpService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class JmpController {

    @Autowired
    private JmpService jmpService;

    @PostMapping(path = "/students")
    public Mono<StudentDto> create(@RequestBody Mono<StudentDto> studentMono) {
        return jmpService.saveStudent(studentMono);
    }

    @PutMapping(path = "/students/{id}")
    public void transferStudent(@PathVariable Integer id) {
        jmpService.transferStudent(id);
    }
}
