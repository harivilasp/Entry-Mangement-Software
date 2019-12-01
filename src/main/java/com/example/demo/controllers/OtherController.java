package com.example.demo.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.RegistrationService;

@Controller
public class OtherController {
 @Autowired
 UserRepository userRepository;


 
@Autowired
RegistrationService registrationService;

 @PostMapping(path="/addvisitor")
 public String regVisit(@RequestParam String name,@RequestParam String email,
		 @RequestParam String mobno,
		 @RequestParam String hostname,@RequestParam String department) {
	 
	 int s=registrationService.addVisit(name,email,mobno,hostname,department);
	return "redirect:/index";
 }
 
 
}