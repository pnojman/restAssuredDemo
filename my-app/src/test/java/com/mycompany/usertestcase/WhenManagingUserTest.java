/**
 * 
 */
package com.mycompany.usertestcase;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.mycompany.app.Config;
import com.mycompany.dao.User;
import com.mycompany.endpoints.Endpoints;

import io.restassured.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author przem
 *
 */
public class WhenManagingUserTest extends Config {
	

	@Test
	public void shouldBeAbleToGetUserById() throws StreamReadException, DatabindException, MalformedURLException, IOException {
		
		User userExpected = objectMapper.readValue(new URL("file:src/test/java/com/mycompany/data/user.json"), User.class);
		
		User userResult = 
		RestAssured.given()
			.pathParam("userId", 1)
		.when()
			.get(Endpoints.GETTING_SINGLE_USER)
		.then()
			.assertThat()
				.extract().as(User.class);
		
		assertThat(userResult).usingRecursiveComparison().isEqualTo(userExpected);
		
		
		
		
		
		
	}

}
