/**
 * 
 */
package com.mycompany.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author przem
 *
 */
public class Geo {

	@JsonProperty("lat")
	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	String lat;

	@JsonProperty("lng")
	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	String lng;
}
