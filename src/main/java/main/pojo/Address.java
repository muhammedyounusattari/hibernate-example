package main.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="address")
@Embeddable
public class Address implements Serializable {

	@Column(name="\"street\"")
	private String street;
	
	@Column(name="\"city\"")
	private String city;
	
	//@Id
	@Column(name="\"zip\"")
	private String zip;
	
	@Column(name="\"state\"")
	private String state;

	public Address(){
		
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
