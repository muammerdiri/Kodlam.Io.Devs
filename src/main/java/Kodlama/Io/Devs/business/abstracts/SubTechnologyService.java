package Kodlama.Io.Devs.business.abstracts;

import java.util.List;

import Kodlama.Io.Devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.Io.Devs.business.responses.GetAllSubTechnologyResponse;

public interface SubTechnologyService {
	List<GetAllSubTechnologyResponse> getAll();
	void add(CreateSubTechnologyRequest createRequest);
}
