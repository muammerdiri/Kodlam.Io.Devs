package Kodlama.Io.Devs.webApi.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.Io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.Io.Devs.business.responses.GetAllSubTechnologyResponse;

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

}
