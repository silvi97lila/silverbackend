package com.silverlila.silverlila.controller;

import com.silverlila.silverlila.model.About;
import com.silverlila.silverlila.repository.AboutRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AboutController {


	private AboutRepository aboutRepository;

    public  AboutController(AboutRepository theAboutRepo){
    	aboutRepository=theAboutRepo;
	}

	@GetMapping("/aboutData")
	@CrossOrigin(origins = "http://localhost:8081")
	public List<About> getAllAboutData(){
		return aboutRepository.findAll();
	}

	@GetMapping("/aboutData/{id}")
	@CrossOrigin(origins = "http://localhost:8081")
	public Optional<About> getAboutById(@PathVariable(value="id") int theId){
		return aboutRepository.findById(theId);

	}

	@PostMapping("/aboutData/save")
	@CrossOrigin(origins = "http://localhost:8081")
	public String saveAboutData(@RequestParam("aboutData") About theAbout){
    	aboutRepository.save(theAbout);
    	return theAbout.toString();
	}

	@GetMapping("/aboutData/delete/{id}")
	@CrossOrigin(origins = "http://localhost:8081")
	public String saveAboutData(@PathVariable("id") int theID){
		aboutRepository.deleteById(theID);
		return "The "+theID+" was deleted from the database";
	}

}
