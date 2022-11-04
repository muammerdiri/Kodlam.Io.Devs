package Kodlama.Io.Devs.business.abstracts;

import java.util.List;

import Kodlama.Io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.responses.GetAllProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguageRequest createRequest);
	void update(int id, UpdateProgrammingLanguageRequest updateRequest);
	void delete(int id);

}
