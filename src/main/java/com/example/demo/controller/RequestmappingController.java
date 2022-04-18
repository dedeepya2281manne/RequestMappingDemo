package com.example.demo.controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapping")
public class RequestmappingController {
	@GetMapping
	public String getMapping() {
		return "Get Mapping Done.";
	}
	@PostMapping
	public String postMapping() {
		return "Post Mapping Done.";
	}
	@PutMapping
	public String putMapping() {
		return "Put Mapping Done.";
	}
	@DeleteMapping
	public String deleteMapping() {
		return "Delete Mapping Done.";
	}
}
