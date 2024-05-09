package com.foly.lab.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
@RequiredArgsConstructor
public class User {

    @GetMapping
    public String index() {
        return "register";
    }

    @PostMapping
    public String register(HttpServletRequest request) {
        String username = request.getParameter("username").trim();
        String ageStr = request.getParameter("age").trim();
        String address = request.getParameter("address").trim();
        try {
            Integer age = Integer.parseInt(ageStr);
            if (age < 18) {
                request.setAttribute("message", "Tuổi bạn nhập chư hợp lệ!");
                return "register";
            }
            request.setAttribute("username", username);
            request.setAttribute("age", age);
            request.setAttribute("address", address);
            return "info";
        } catch (NumberFormatException exception) {
            request.setAttribute("message", "Tuổi phải là số!");
            return "register";
        }

    }
}
