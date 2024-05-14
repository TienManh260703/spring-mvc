package com.example.buoi2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/form")
    public String form() {
        return "user/login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("a") && password.equals("a")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            return "user/info";
        }
        request.setAttribute("message", "thoogn báo");
        return "user/login";
    }
}
