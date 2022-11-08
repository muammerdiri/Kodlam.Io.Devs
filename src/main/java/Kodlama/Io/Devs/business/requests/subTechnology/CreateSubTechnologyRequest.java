package Kodlama.Io.Devs.business.requests.subTechnology;

import Kodlama.Io.Devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateSubTechnologyRequest {
	private ProgrammingLanguage programmingLanguage;
	private String name;
}
