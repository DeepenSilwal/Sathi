package com.silwalconsulting.sathi.controller;

import com.silwalconsulting.sathi.enums.GENDER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class Register {

    @GetMapping("/")
    public String register(ModelMap map){
        map.put("gender", GENDER.values());
        return "register";
    }
}
