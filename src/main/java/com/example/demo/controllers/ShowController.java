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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.CheckProfile;
import com.example.demo.service.RegistrationService;
import com.example.demo.service.ShowService;
import com.example.demo.service.TransferService;

@Controller
public class ShowController {

@Autowired
CheckProfile checkProfile;

@Autowired
ShowService showService;

 @GetMapping(path="/showadmin")
 public String showAdmin(ModelMap model) {
	 model.put("alladmin",checkProfile.getAll("admin"));
		return "showadmin";
 }
 
 @GetMapping(path="/showemp")
 public String showEmp(ModelMap model) {
	 model.put("allemp",checkProfile.getAll("emp"));
	return "showemp";
 }
 
 @GetMapping(path="/showcust")
 public String showCust(ModelMap model) {
	 model.put("allcust",checkProfile.getAll("cust"));
	return "showcust";
 }
}