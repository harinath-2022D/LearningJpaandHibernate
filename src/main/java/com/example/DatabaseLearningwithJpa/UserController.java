package com.example.DatabaseLearningwithJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/get-user")
    public User getUser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }
}
