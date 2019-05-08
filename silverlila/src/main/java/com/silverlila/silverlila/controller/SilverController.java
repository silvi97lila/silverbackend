package com.silverlila.silverlila.controller;

import com.silverlila.silverlila.model.Silver;
import com.silverlila.silverlila.repository.SilverRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SilverController {

	SilverRepository silver;

	public SilverController(SilverRepository theSilver){
		silver=theSilver;
	}

	@GetMapping("/settings")
	@CrossOrigin(origins = "http://localhost:8081")
	public List<Silver> getAllData(){
		return silver.findAll();
	}

}
