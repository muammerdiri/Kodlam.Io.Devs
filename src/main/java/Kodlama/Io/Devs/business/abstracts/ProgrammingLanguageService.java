package Kodlama.Io.Devs.business.abstracts;

import java.util.List;

import Kodlama.Io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.Io.Devs.business.responses.GetAllProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void Add(CreateProgrammingLanguageRequest createRequest);
}
