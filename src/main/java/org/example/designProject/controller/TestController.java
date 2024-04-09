package org.example.designProject.controller;

import org.example.designProject.entity.Contents;
import org.example.designProject.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {
    @GetMapping("/contents")
    public Contents getContents() {
        User user = new User("user01", "1234");
        return new Contents(1, "test", "test를 해보자", user, LocalDateTime.now(), LocalDateTime.now());
    }
}
