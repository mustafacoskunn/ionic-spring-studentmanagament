package com.example.studentmanagament.service;

import com.example.studentmanagament.entity.Users;

public interface UserService {

    Users register(Users user);

    Users login(Users user);


}
