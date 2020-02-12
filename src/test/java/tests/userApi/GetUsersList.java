package tests.userApi;

import basic.BasicApi;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUsersList extends BasicApi {

    @Test
    public void getUsersList(){
        given()
                .auth().oauth2(token.getToken("root@client", "admin"))
                .get("/users")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("pagination.total", equalTo(28));
    }
}
