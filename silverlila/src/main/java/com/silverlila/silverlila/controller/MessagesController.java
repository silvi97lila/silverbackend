package com.silverlila.silverlila.controller;

import com.silverlila.silverlila.model.Messages;
import com.silverlila.silverlila.model.Users;
import com.silverlila.silverlila.repository.MessagesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessagesController {

	MessagesRepository messagesRepository;

	public MessagesController(MessagesRepository theMsgRepo){
		messagesRepository=theMsgRepo;
	}

	@GetMapping("/messages")
	@CrossOrigin(origins = "http://localhost:8081")
	public List<Messages> getAllData(){
		return messagesRepository.findAll();
	}

	@PostMapping("/messages")
	@CrossOrigin(origins = "http://localhost:8081")
	public String inserThedata(@RequestBody Messages theNewMsg){
		messagesRepository.save(theNewMsg);
		return theNewMsg.toString();
	}
}
