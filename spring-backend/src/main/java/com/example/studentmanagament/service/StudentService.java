package com.example.studentmanagament.service;

import com.example.studentmanagament.entity.Students;

import java.util.List;

public interface StudentService {

    Students studentCreate(Students students);

    List<Students> getAll(Long created_id);

    Boolean deleteStudent(Long id);

    Students editStudent(Long id,Students students);




}
