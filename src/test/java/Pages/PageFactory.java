package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;

    public PageFactory(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public PageFactory(WebDriver driver) {

    }


    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

}
