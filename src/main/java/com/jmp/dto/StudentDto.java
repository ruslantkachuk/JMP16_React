package com.jmp.dto;

import com.jmp.enums.Level;

public class StudentDto {

    private Integer id;
    private String name;
    private Integer age;
    private Integer averageMark;
    private String skill;
    private Level level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
