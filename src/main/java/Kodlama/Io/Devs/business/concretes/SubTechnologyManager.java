package Kodlama.Io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.Io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.Io.Devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.Io.Devs.business.responses.GetAllSubTechnologyResponse;
import Kodlama.Io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.Io.Devs.entities.concretes.SubTechnology;
@Service
public class SubTechnologyManager implements SubTechnologyService{

	private SubTechnologyRepository repository;
	
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<GetAllSubTechnologyResponse> getAll() {
		
		List<SubTechnology> subTechnologies = repository.findAll();
		List<GetAllSubTechnologyResponse> responseList = new ArrayList<>();
		
		for(SubTechnology technology:subTechnologies) {
			GetAllSubTechnologyResponse technologyResponseItem = new GetAllSubTechnologyResponse();
			technologyResponseItem.setId(technology.getId());
			technologyResponseItem.setName(technology.getName());
			technologyResponseItem.setProgrammingLanguageName(technology.getProgrammingLanguage().getName());
			
			responseList.add(technologyResponseItem);
		}
		
		return responseList;
	}

	@Override
	public void add(CreateSubTechnologyRequest createRequest) {
		// TODO Auto-generated method stub
		
	}

}
