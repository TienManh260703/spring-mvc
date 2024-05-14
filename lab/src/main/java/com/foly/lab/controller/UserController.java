package com.foly.lab.controller;

import com.foly.lab.requset.LoginRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public String index() {
        return "register";
    }

//    @PostMapping
//    public String register(HttpServletRequest request) {
//        String username = request.getParameter("username").trim();
//        String ageStr = request.getParameter("age").trim();
//        String address = request.getParameter("address").trim();
//        try {
//            Integer age = Integer.parseInt(ageStr);
//            if (age < 18) {
//                request.setAttribute("message", "Tuoi khong hop le!");
//                return "register";
//            }
//            request.setAttribute("username", username);
//            request.setAttribute("age", age);
//            request.setAttribute("address", address);
//            return "info";
//        } catch (NumberFormatException exception) {
//            request.setAttribute("message", "Tuoi phai la so!");
//            return "register";
//        }
//
//    }

//    @PostMapping
//    public String register(@RequestParam String username,
//                           @RequestParam int age,
//                           @RequestParam String address,
//                           Model model) {
//        try {
//            if (age < 18) {
//                model.addAttribute("message", "Tuoi khong hop le!");
//                return "register";
//            }
//            model.addAttribute("username", username);
//            model.addAttribute("age", age);
//            model.addAttribute("address", address);
//            return "info";
//        } catch (NumberFormatException exception) {
//            model.addAttribute("message", "Tuoi phai la so!");
//            return "register";
//        }
//
//    }

    @PostMapping
    public String register (LoginRequest request ,Model model){
        String username = request.getUsername();
        String address = request.getAddress();
        int age = request.getAge();

        try {
            if (age < 18) {
                model.addAttribute("message", "Tuoi khong hop le!");
                return "register";
            }
            model.addAttribute("username", username);
            model.addAttribute("age", age);
            model.addAttribute("address", address);
            return "info";
        } catch (NumberFormatException exception) {
            model.addAttribute("message", "Tuoi phai la so!");
            return "register";
        }
    }


    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(LoginRequest loginRequest, Model model,
                        @RequestParam(value = "remember", defaultValue = "false") boolean rm,
                        HttpServletResponse response) {
        String username = loginRequest.getUsername();
        String address = loginRequest.getUsername();
        if(username.equals("fpt") && address.equals("fpt")) {
            model.addAttribute("username", username);
            model.addAttribute("address", address);

            Cookie ckiUsr = new Cookie("usr", username);
            Cookie ckiPwd = new Cookie("pwd", address);

            int expiry = 0;
            if(rm == true) {
                expiry = 24 * 60 * 60 * 3;
            }
            ckiUsr.setMaxAge(expiry);
            ckiPwd.setMaxAge(expiry);

            response.addCookie(ckiUsr);
            response.addCookie(ckiPwd);
            return "views/info";
        }
        model.addAttribute("message", "Thong tin dang nhap sai");
        return "views/register";
    }

    @RequestMapping("/readCookie")
    public String readCookie(@CookieValue("usr") String username,
                             @CookieValue("pwd") String password,
                             Model model) {
        model.addAttribute("usr", username);
        model.addAttribute("pwd", password);
        return "views/info";
    }
}
