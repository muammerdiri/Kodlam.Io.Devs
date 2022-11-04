package Kodlama.Io.Devs.webApi.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.Io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.Io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.responses.GetAllProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguageController {

	private ProgrammingLanguageService languageService;
	

	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll(){
		return languageService.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createLanguage) {
		languageService.add(createLanguage);
	}
	
	@PutMapping("/update")
	public void update(int id,UpdateProgrammingLanguageRequest request) {
		 languageService.update(id,request);			
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
	}
	
	
	
}
 