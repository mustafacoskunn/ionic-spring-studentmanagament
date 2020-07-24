package com.example.studentmanagament.repository;

import com.example.studentmanagament.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

    Users getByEmailAndPassword(String email,String password);


}
