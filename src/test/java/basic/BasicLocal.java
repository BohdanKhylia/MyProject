package basic;

import com.codeborne.selenide.Configuration;
import helpers.phpTravelsAccount.AccountHelper;
import helpers.phpTravelsLogin.LoginHelper;
import org.testng.annotations.BeforeClass;


public class BasicLocal {

    public LoginHelper loginPage = new LoginHelper();
    public AccountHelper accountPage = new AccountHelper();

    @BeforeClass
    public void setUpTests(){
        Configuration.browser = System.getProperty("browserType", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "78.0");
        Configuration.savePageSource = false;
        Configuration.startMaximized = true;
        //Configuration.screenshots = false;
    }
}
