/*
Each SelenideElement object here is an element from DOM tree, on Login page.
Each method allows to interact elements on Login page.
 */

package helpers.phpTravelsLogin;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginHelper {

    public static String phpTravelsUrl = "https://www.phptravels.net";
    private String loginRoute = "/login";
    private String validationText = "Invalid Email or Password";

    private SelenideElement usernameField = $(".form-group input[type='email']");
    private SelenideElement passwordField = $(".form-group input[type='password']");
    private SelenideElement rememberMeCheckBox = $("#remember-me");
    private SelenideElement loginButton = $("#loginfrm button");
    private SelenideElement helloMessage = $("h3.text-align-left");
    private SelenideElement validationMessage = $(".alert.alert-danger");

    @Step("Open login page")
    public void openLoginPage(){
        open(phpTravelsUrl.concat(loginRoute));
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

    @Step("Check, that validation message visible")
    public void checkValidationMessage(){
        validationMessage.shouldHave(text(validationText));
    }

    public void login(String username, String password){
        openLoginPage();
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        checkLoginSuccess();
    }

}
