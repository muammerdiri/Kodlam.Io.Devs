package Kodlama.Io.Devs.business.abstracts;

import java.util.List;

import Kodlama.Io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.Io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.Io.Devs.business.responses.subTechnology.GetAllSubTechnologyResponse;

public interface SubTechnologyService {
	List<GetAllSubTechnologyResponse> getAll();
	void add(CreateSubTechnologyRequest createRequest);
	void update(int id,UpdateSubTechnologyRequest updateRequest);
	void delete(int id);
}