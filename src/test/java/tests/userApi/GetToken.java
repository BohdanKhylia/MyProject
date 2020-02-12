package tests.userApi;

import static io.restassured.RestAssured.given;

public class GetToken {

    protected String getToken(String username, String password) {
        String token = given()
                .body("{\n" +
                "  \"login\": \"" + username + "\",\n" +
                "  \"password\": \"" + password + "\"\n" +
                "}")
                .post("/login")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .extract()
                .body()
                .jsonPath().get("data.token");
        return token;
    }
}