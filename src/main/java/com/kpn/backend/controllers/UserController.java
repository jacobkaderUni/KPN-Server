package com.kpn.backend.controllers;

import com.kpn.backend.model.User;
import com.kpn.backend.repositories.UserRepository;
import com.kpn.backend.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("")
    public User loginByIdAndPassword(int id, String password, HttpSession session) {
        User loggedInUser = userService.login(id, password);

        session.setAttribute("loggedInUser", loggedInUser);

        return loggedInUser;
    }
}
