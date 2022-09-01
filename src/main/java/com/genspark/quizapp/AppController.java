package com.genspark.quizapp;

import com.genspark.quizapp.Entity.User;
import com.genspark.quizapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
    @Autowired
    private UserRepository repo;

    @GetMapping(path = "/")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping(path = "/login")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "";
    }

    @PostMapping(" ")
    public String processRegistration(User user){
        repo.save(user);
        return "Registered Successfully!";
    }
}
