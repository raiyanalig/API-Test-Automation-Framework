package tests;

import static org.hamcrest.Matchers.equalTo;
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
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("Leanne Graham"))
                .body("username", equalTo("Bret"));
    }
}