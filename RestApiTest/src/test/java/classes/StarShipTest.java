package classes;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.StarShip;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class StarShipTest extends BaseTestClass {
    public String expectedValue = "Death Star";

    @Test
    public void checkNameTest() {
        StarShip starShip = given()
                .contentType(ContentType.JSON)
                .when().get(baseURI)
                .then().statusCode(200)
                .and().extract().as(StarShip.class);
        Assert.assertEquals(starShip.getName(), expectedValue);
    }
}
