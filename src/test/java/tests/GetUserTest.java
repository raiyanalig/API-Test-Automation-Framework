package tests;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import base.BaseTest;
import static io.restassured.RestAssured.given;

public class GetUserTest extends BaseTest {

    private static final int USER_ID = 1;
    private static final String USER_NAME = "Leanne Graham";
    private static final String USERNAME = "Bret";

    @Test
    public void shouldReturnUserDetailsForValidUserId() {
        given()
            .pathParam("id", USER_ID)
        .when()
            .get("/users/{id}")
        .then()
            .statusCode(200)
            .body("id", equalTo(USER_ID))
            .body("name", equalTo(USER_NAME))
            .body("username", equalTo(USERNAME));
    }
}