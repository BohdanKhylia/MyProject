package tests.profile;

import basic.BasicLocal;
import helpers.phpTravelsLogin.LoginHelper;
import org.testng.annotations.Test;

public class ProfileEditing extends BasicLocal {

    @Test(priority = 1, description = "Changing of profile with next data and saving it")
    public void changeProfile(){
        accountPage.openProfilePage(LoginHelper.phpTravelsUrl);
        accountPage
                .withAddress1("TestOne Address 1")
                .withAddress2("TestOne Address 2")
                .withCity("TestOne City")
                .withCountry("Austria")
                .withPhone("1234567890")
                .withState("Tyrol")
                .withZipCode("52001").build();
    }
}
