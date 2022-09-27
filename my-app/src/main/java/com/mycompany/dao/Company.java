/**
 * 
 */
package com.mycompany.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author przem
 *
 */
public class Company {

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	@JsonProperty("catchPhrase")
	public String getCatchPhrase() {
		return this.catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	String catchPhrase;

	@JsonProperty("bs")
	public String getBs() {
		return this.bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	String bs;

}
