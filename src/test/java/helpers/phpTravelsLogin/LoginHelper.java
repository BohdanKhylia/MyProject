package helpers.phpTravelsLogin;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginHelper {

    private String PhpTravelsUrl = "https://www.phptravels.net";
    private String loginRoute = "/login";

    private SelenideElement usernameField = $(".form-group input[type='email']");
    private SelenideElement passwordField = $(".form-group input[type='password']");
    private SelenideElement rememberMeCheckBox = $("#remember-me");
    private SelenideElement loginButton = $("#loginfrm button");
    private SelenideElement helloMessage = $("h3.text-align-left");

    @Step("Open login page")
    public void openLoginPage(){
        open(PhpTravelsUrl.concat(loginRoute));
    }

    @Step("Set username value")
    public void setUsername(String username){
        usernameField.setValue(username);
        usernameField.shouldHave(value(username));
    }

    @Step("Set password value")
    public void setPassword(String password){
        passwordField.setValue(password);
    }

    @Step("Check remember me tick")
    public void rememberMe(){
        rememberMeCheckBox.click();
    }

    @Step("Click on login button")
    public void clickLoginButton(){
        loginButton.click();
    }

    @Step("Verify, that login is processed successfully")
    public void checkLoginSuccess(){
        helloMessage.shouldBe(visible);
    }

    public void login(String username, String password){
        openLoginPage();
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        checkLoginSuccess();
    }

}
