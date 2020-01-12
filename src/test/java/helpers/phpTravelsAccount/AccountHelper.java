/*
Each SelenideElement object here is an element from DOM tree, on Account page.
This class constructed with using Builder pattern of design. This approach
is experimental for building forms with a lot of fields per page.
 */

package helpers.phpTravelsAccount;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AccountHelper {

    private String accountRote = "/account";
    private SelenideElement profileButton = $("a[href='#profile']");
    private SelenideElement address1Field = $("input[name='address1']");
    private SelenideElement address2Field = $("input[name='address2']");
    private SelenideElement cityField = $("input[name='city']");
    private SelenideElement stateField = $("input[name='state']");
    private SelenideElement zipField = $("input[name='zip']");
    private SelenideElement phoneField = $("input[name='phone']");
    private SelenideElement countryField = $(".chosen-search-input");
    private SelenideElement selectCountry = $(".chosen-results li");
    private SelenideElement submitButton = $(".btn.btn-block.updateprofile.btn-primary");

    @Step("Open profile page on user account page")
    public void openProfilePage(String baseUrl){
        open(baseUrl.concat(accountRote));
        profileButton.click();
    }

    @Step("Set first address value to user profile")
    public AccountHelper withAddress1(String address){
        AccountHelper.this.address1Field.setValue(address).shouldHave(value(address));
        return this;
    }

    @Step("Set second address value to user profile")
    public AccountHelper withAddress2(String address){
        AccountHelper.this.address2Field.setValue(address).shouldHave(value(address));
        return this;
    }

    @Step("Set city value to users profile")
    public AccountHelper withCity(String city){
        AccountHelper.this.cityField.setValue(city).shouldHave(value(city));
        return this;
    }

    @Step("Set state value to user profile")
    public AccountHelper withState(String state){
        AccountHelper.this.stateField.setValue(state).shouldHave(value(state));
        return this;
    }

    @Step("Set zip code value to user profile")
    public AccountHelper withZipCode(String zip){
        AccountHelper.this.zipField.setValue(zip).shouldHave(value(zip));
        return this;
    }

    @Step("Set country value to user profile")
    public AccountHelper withCountry(String country){
        AccountHelper.this.countryField.setValue(country).shouldHave(value(country));
        AccountHelper.this.selectCountry.click();
        return this;
    }

    @Step("Set phone number value to user profile")
    public AccountHelper withPhone(String phone){
        AccountHelper.this.phoneField.setValue(phone).shouldHave(value(phone));
        return this;
    }

    @Step("Save user profile")
    public AccountHelper build(){
        AccountHelper.this.submitButton.click();
        return AccountHelper.this;
    }
}
