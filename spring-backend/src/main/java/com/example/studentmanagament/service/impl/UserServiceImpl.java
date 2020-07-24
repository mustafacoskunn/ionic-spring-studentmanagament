package com.example.studentmanagament.service.impl;

import com.example.studentmanagament.entity.Users;
import com.example.studentmanagament.repository.UserRepository;
import com.example.studentmanagament.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Users register(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users login(Users user) {
      return userRepository.getByEmailAndPassword(user.getEmail(),user.getPassword());
    }

}
