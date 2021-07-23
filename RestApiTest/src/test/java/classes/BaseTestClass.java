package classes;

import io.restassured.RestAssured;

public class BaseTestClass {
    public BaseTestClass() {
        RestAssured.baseURI = "https://swapi.dev/api/starships/9";
     }
}
