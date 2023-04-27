package com.studentSurvery.surveyform.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.studentSurvery.surveyform.entity.UserDtls;
import com.studentSurvery.surveyform.repository.UserRepository;

import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	
	@GetMapping("/")
	public String home(Model model) {
		 model.addAttribute("UserDtls", new UserDtls());
		return "index";
	}


	@GetMapping("/surveysRecord")
	public String getAllSurveys(Model model) {
	    List<UserDtls> surveys = repo.findAll();
	    model.addAttribute("surveys", surveys);
	    return "surveysRecord";
	}
	
	@PostMapping("/submit")
    public ResponseEntity<?> submitForm(@RequestBody UserDtls userObject) {
        // map fields from userObject to Student entity
		System.out.println(userObject);
		repo.save(userObject);
        return ResponseEntity.ok().build();
    }
}


