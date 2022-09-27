/**
 * 
 */
package com.mycompany.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author przem
 *
 */
public class Address {

	@JsonProperty("street")
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	String street;

	@JsonProperty("suite")
	public String getSuite() {
		return this.suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	String suite;

	@JsonProperty("city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String city;

	@JsonProperty("zipcode")
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	String zipcode;

	@JsonProperty("geo")
	public Geo getGeo() {
		return this.geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	Geo geo;

}
