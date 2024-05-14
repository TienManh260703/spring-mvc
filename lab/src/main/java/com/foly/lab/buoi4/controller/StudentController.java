package com.foly.lab.buoi4.controller;

import com.foly.lab.buoi4.entity.Student;
import com.foly.lab.buoi4.service.StudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("students")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentController {
    StudentService studentService = new StudentService();

    @GetMapping
    public String index(Model model) {
        model.addAttribute("students", studentService.getStudents());
        return "student/index";
    }

    @GetMapping("show-create")
    public String showCreateForm() {
        return "student/form";
    }

    @PostMapping("create")
    public String create(Student student) {
        studentService.create(student);
        return "redirect:/students";
    }

    @PostMapping("update")
    public String update(Student student) {
        studentService.update(student);
        return "redirect:/students";
    }

    @GetMapping("update/{id}")
    public String showUpdateForm(@PathVariable String id , Model model) {
        Student student =  studentService.findById(id);
        model.addAttribute("student", student);
        return "student/update";
    }

    @GetMapping("detail")
    public String detail (@RequestParam String id , Model model){
      Student student =  studentService.findById(id);
      model.addAttribute("student", student);
        return "student/detail";
    }
    @GetMapping("delete")
    public String delete (@RequestParam String id){
        studentService.delete(id);
        return "redirect:/students";
    }
}
