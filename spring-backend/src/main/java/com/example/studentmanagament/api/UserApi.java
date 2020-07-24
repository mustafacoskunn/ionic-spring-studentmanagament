package com.example.studentmanagament.api;

import com.example.studentmanagament.entity.Users;
import com.example.studentmanagament.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {
    private final UserServiceImpl userService;

    public UserApi(UserServiceImpl userService) {
        this.userService = userService;
    }


    @PostMapping("/api/register")
    public ResponseEntity<Users> register(@RequestBody Users user) {
        return ResponseEntity.ok(userService.register(user));
    }
    @PostMapping("/api/login")
    public ResponseEntity<Users> login(@RequestBody Users user) {

        return ResponseEntity.ok(userService.login(user));
    }
}
