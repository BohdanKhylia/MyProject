package basic;

import com.codeborne.selenide.Configuration;
import helpers.phpTravelsAccount.AccountHelper;
import helpers.phpTravelsLogin.LoginHelper;
import org.testng.annotations.BeforeClass;

public class BasicLive {

    public LoginHelper loginPage = new LoginHelper();
    public AccountHelper accountPage = new AccountHelper();

    @BeforeClass
    public void setUpTests(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = System.getProperty("browserType", "chrome");
        Configuration.browserCapabilities.setCapability("version", System.getProperty("browserVersion", "78.0"));
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities.setCapability("enableVideo", false);
        Configuration.savePageSource = false;
        Configuration.startMaximized = true;
        //Configuration.screenshots = false;
    }
}
