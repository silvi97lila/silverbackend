package com.silverlila.silverlila.controller;

import com.silverlila.silverlila.model.Users;
import com.silverlila.silverlila.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UsersController {

	private UsersRepository usersRepository;
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public UsersController(UsersRepository theUserRepo ){
			this.usersRepository=theUserRepo;

		}

		@GetMapping("/users")
		@CrossOrigin(origins = "http://localhost:8081")
		public List<Users> getAllUsers(){
			return usersRepository.findAll();
		}

		@PostMapping("/users")
		public void saveData(@RequestBody Users theuser){
		 usersRepository.save(theuser);
		}


		@DeleteMapping("/users/{id}")
		@CrossOrigin(origins = "http://localhost:8081")
		public String deleteFromUsers(@PathVariable("id") int theId){
			usersRepository.deleteById(theId);
			return "The "+theId+" was deleted from the users table";
		}
		@PutMapping("/users/{id}")
		@CrossOrigin(origins = "http://localhost:8081")
	    public String updateUser(@PathVariable("id") int id, @RequestBody Users theuser){
			Optional<Users> userOpt=usersRepository.findById(id);
			theuser.setId(id);
			usersRepository.save(theuser);
			return theuser.toString();
		}




}
