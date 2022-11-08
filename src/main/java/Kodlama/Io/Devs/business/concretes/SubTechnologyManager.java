package Kodlama.Io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.Io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.Io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.Io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.Io.Devs.business.responses.subTechnology.GetAllSubTechnologyResponse;
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
		SubTechnology subTechnology= new SubTechnology();
		subTechnology.setName(createRequest.getName());
		subTechnology.setProgrammingLanguage(createRequest.getProgrammingLanguage());
		
		repository.save(subTechnology);
		
		
	}

	@Override
	public void update(int id, UpdateSubTechnologyRequest updateRequest) {
		Optional<SubTechnology> subTechnology = repository.findById(id);
		SubTechnology technology= subTechnology.get();
		technology.getProgrammingLanguage().setId(updateRequest.getProgrammingLanguageId());
		technology.setName(updateRequest.getName());
		repository.save(technology);
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}

}
