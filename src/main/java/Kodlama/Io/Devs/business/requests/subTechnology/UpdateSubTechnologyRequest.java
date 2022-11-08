package Kodlama.Io.Devs.business.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnologyRequest {
	
	private String name;
	private int programmingLanguageId;
	
}