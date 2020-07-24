package com.example.studentmanagament.repository;

import com.example.studentmanagament.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students,Long> {

    List<Students> findAllByCreatedId(Long createdId);



}
