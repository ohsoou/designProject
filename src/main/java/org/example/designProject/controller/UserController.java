package org.example.designProject.controller;

import org.example.designProject.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/register")
    public boolean register(User userInfo) {
        return true;
    }
}
