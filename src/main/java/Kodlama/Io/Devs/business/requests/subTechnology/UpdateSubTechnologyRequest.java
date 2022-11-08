package Kodlama.Io.Devs.business.requests.subTechnology;

import Kodlama.Io.Devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnologyRequest {
	
	private String name;
	private ProgrammingLanguage programmingLanguage;
	
}
