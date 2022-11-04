package Kodlama.Io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.Io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.Io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.Io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.Io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository languageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		
		List<ProgrammingLanguage> list = languageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> responseList = new ArrayList<>();
		for(ProgrammingLanguage language:list) {
			
			GetAllProgrammingLanguageResponse responseItem= new GetAllProgrammingLanguageResponse();
			
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			
			responseList.add(responseItem);
			
		}
		
		return responseList;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createRequest) {
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createRequest.getName());

		languageRepository.save(programmingLanguage);
		
	}

	@Override
	public void update(int id, UpdateProgrammingLanguageRequest updateRequest) {
		
		Optional<ProgrammingLanguage> programmingLanguage = languageRepository.findById(id);
		programmingLanguage.get().setName(updateRequest.getName());
		languageRepository.save(programmingLanguage.get());
	
	}

	@Override
	public void delete(int id) {
		languageRepository.deleteById(id);
	}
	


	
	
}
