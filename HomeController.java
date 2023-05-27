package com.example.springboot.controller;

import com.example.springboot.db.DBManager;
import com.example.springboot.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String studentPage(Model model){
        ArrayList<Student> students = DBManager.getSt();
        model.addAttribute("studenty", students);
        return "index";
    }

    @GetMapping(value = "/add-st")
    public String addStPage(Model model){
        return "addSt";
    }

    @PostMapping(value = "/add-st")
    public String addSt(Student student){
        DBManager.addSt(student);
        return "redirect:/";
    }
}

