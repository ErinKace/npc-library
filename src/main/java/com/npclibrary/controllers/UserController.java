package com.npclibrary.controllers;

import com.npclibrary.data.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.npclibrary.models.User;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    public User getUserFromSession(HttpSession session) {

    }
}
