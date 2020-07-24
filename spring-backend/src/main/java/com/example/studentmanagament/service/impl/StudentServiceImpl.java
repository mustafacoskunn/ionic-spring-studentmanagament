package com.example.studentmanagament.service.impl;

import com.example.studentmanagament.entity.Students;
import com.example.studentmanagament.repository.StudentRepository;
import com.example.studentmanagament.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {


    private  final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Students studentCreate(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public List<Students> getAll(Long created_id) {
        return studentRepository.findAllByCreatedId(created_id);
    }

    @Override
    public Boolean deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRES_NEW)
    public Students editStudent(Long id,Students students) {

        Students studentsexample=new Students();
        studentsexample=studentRepository.getOne(id);;

        studentsexample.setAddress(students.getAddress());
        studentsexample.setAge(students.getAge());
        studentsexample.setName(students.getName());

        studentRepository.save(studentsexample);

        return studentsexample;
    }



}
