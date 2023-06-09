package com.example.DatabaseLearningwithJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user) {
        userRepository.save(user);
        return "user added successfully";
    }

    public User getUser(Integer userId) {
        try{
            User user = userRepository.findById(userId).get();
            return user;
        }catch (Exception ex){
            System.out.println("User is not present with given id "+userId);
            return null;
        }

    }
}
