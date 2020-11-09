package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Destination {
	
	//attributes
	private String country;
	private String state;
	private String city;


	//all args
	public Destination(String country, String state, String city) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
	}

}
