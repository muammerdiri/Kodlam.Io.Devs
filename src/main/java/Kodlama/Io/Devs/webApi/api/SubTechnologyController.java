package Kodlama.Io.Devs.webApi.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.Io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.Io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.Io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.Io.Devs.business.responses.subTechnology.GetAllSubTechnologyResponse;

@RestController
@RequestMapping("api/subtechnologies")
public class SubTechnologyController {
	
	private SubTechnologyService technologyService;

	public SubTechnologyController(SubTechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	
	@GetMapping("/getall")
	public List<GetAllSubTechnologyResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PutMapping("/update")
	public void update(int id, UpdateSubTechnologyRequest request) {
		technologyService.update(id, request);
	}

	@DeleteMapping("/delete")
	public void delete(int id) {
		technologyService.delete(id);
	}
	
	@PostMapping("/add")
	public void add(CreateSubTechnologyRequest request) {
		technologyService.add(request);
	}
	
}
