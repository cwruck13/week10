package dmacc.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//attributes
	private long id;
	private String name;
	private String phone;
	private String takingTrip;
	@Autowired
	private Destination destination;
	
	//1 arg
	public Contact(String name) {
		super();
		this.name = name;
	}

	//3 args
	public Contact(String name, String phone, String takingTrip) {
		super();
		this.name = name;
		this.phone = phone;
		this.takingTrip = takingTrip;
	}

	//all args
	public Contact(long id, String name, String phone, String takingTrip) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.takingTrip = takingTrip;
	}

}
