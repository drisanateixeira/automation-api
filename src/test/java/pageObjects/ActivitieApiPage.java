package pageObjects;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import utils.Constants;

public class ActivitieApiPage implements Constants{
	public static int ID;
  
	@SuppressWarnings({ "unchecked" })
	@Test
	public void createActivitie(Integer idActivitie, String title, Integer status) throws Exception {

		Object objeto = new JSONParser().parse(new FileReader("file-json/postActivities.json"));
		JSONObject file = (JSONObject) objeto;
		file.replace("id", idActivitie);
		file.replace("title", title);
		ID = given().filter(new AllureRestAssured()).log().all().body(file).contentType(ContentType.JSON).when()
				.post(URL + PATH)
				.then().log().all().statusCode(status).extract().jsonPath().get("id");
	}

	@Test
	public void validateIdActivitie( String nameActivitie, Integer status)  {
		given().filter(new AllureRestAssured()).log().all()
				.when().get(URL + PATH + ID)
				.then().log().all().statusCode(status).body("id", is(ID)).body("completed", is(true)).body("title", is(nameActivitie));
	}

	@Test
	public void getAllActivities(Integer status) throws Exception {
		given().filter(new AllureRestAssured()).log().all()
				.when().get(URL + PATH)
				.then().log().all().statusCode(status);
	}

}
