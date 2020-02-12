package basic;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import tests.userApi.GetToken;

public class BasicApi {

    protected GetToken token = new GetToken();

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "https://api.test-gpp.bintime.com/api/bo";
    }
}
