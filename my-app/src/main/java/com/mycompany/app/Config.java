/**
 * 
 */
package com.mycompany.app;

import org.junit.BeforeClass;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * @author przem
 *
 */
public class Config {

	public static RequestSpecification requestSpecification;

	public static ResponseSpecification responseSpecification;
	
	public static ObjectMapper objectMapper;

	@BeforeClass

	public static void setup() {

		requestSpecification = new RequestSpecBuilder()

				.setBaseUri(System.getProperty("url"))

				.addHeader("Content-Type", "application/json")

				.addFilter(new RequestLoggingFilter())

				.addFilter(new ResponseLoggingFilter())

				.build();

		RestAssured.requestSpecification = requestSpecification;

		responseSpecification = new ResponseSpecBuilder()

				.expectStatusCode(200)

				.build();

		RestAssured.responseSpecification = responseSpecification;
		
		objectMapper = new ObjectMapper();

	}

}
