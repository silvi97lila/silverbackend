package com.silverlila.silverlila.controller;

import com.silverlila.silverlila.model.Work;
import com.silverlila.silverlila.repository.WorkRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkController {

	WorkRepository workRepository;

	public WorkController(WorkRepository theWorkRepo) {
		workRepository = theWorkRepo;
	}

	@GetMapping("/workData")
	@CrossOrigin(origins = "http://localhost:8081")
	public List<Work> getAllWorkData() {
      return workRepository.findAll();
	}

}
