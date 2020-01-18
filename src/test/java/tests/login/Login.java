package tests.login;

import basic.BasicLocal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Login extends BasicLocal {

    @Test(priority = 1,dataProvider = "loginValidation", description = "Verification of login form validation")
    public void loginValidation(String username, String password){
        loginPage.openLoginPage();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        loginPage.checkValidationMessage();
    }

    @Test(priority = 2, description = "Login with exists credentials")
    public void loginToAccount(){
        loginPage.login("user@phptravels.com", "demouser");
    }

    @DataProvider()
    public Iterator<Object[]> loginValidation() throws IOException {
        List<Object[]> list = new ArrayList<>();
        Files.readAllLines(Paths.get("src/test/resources/testDataForLogin/LoginValidationData.csv"))
                .forEach(line -> list.add(new Object[]{line.split(",")[0],line.split(",")[1]}));
        return list.iterator();
    }
}
