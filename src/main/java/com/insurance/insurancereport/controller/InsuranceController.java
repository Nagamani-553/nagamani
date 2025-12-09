package com.insurance.insurancereport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insurance.insurancereport.entity.CitizenPlan;
import com.insurance.insurancereport.service.InsuranceServiceInterface;
import com.insurance.insurancereport.utilities.SearchRequest;

@Controller
public class InsuranceController {

	@Autowired
	private InsuranceServiceInterface service;
	
	@PostMapping("/search")
	private String handleSearch(@ModelAttribute("search") SearchRequest searchRequest,Model model) {
		init(model);
		System.out.println(searchRequest);
		List<CitizenPlan> search = service.search(searchRequest);
		model.addAttribute("plans",search);
		return "index";
		
	}
	@GetMapping("/")
	private String indexPage(Model model) {
		model.addAttribute("search", new SearchRequest());
		init(model);
		return "index";
	}
	
	private void init(Model model) {
		model.addAttribute("names",service.getPlanNames());
		model.addAttribute("status",service.getPlanStatus());
	}
}
