package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import static io.restassured.RestAssured.given;

public class GetUserTest extends BaseTest {

    @Test
    public void getUserTest() {

        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200);
    }
}