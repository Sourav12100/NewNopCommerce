package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private SystemPage systemPage;

    public PageFactory(LoginPage loginPage) {
        this.loginPage = loginPage;
    }
    public PageFactory(SystemPage systemPage){
        this.systemPage = systemPage;
    }

    public PageFactory(WebDriver driver) {

    }


    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public  SystemPage getSystemPage(){
        if (systemPage == null){
            systemPage = new SystemPage(driver);
        }
        return  systemPage;
    }

}
