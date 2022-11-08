package Kodlama.Io.Devs.business.abstracts;

import java.util.List;

import Kodlama.Io.Devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguageResponse;
import Kodlama.Io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguageRequest createRequest);
	void update(int id, UpdateProgrammingLanguageRequest updateRequest);
	void delete(int id);
	GetByIdProgrammingLanguageResponse getById(int id);
	
	
	

}
