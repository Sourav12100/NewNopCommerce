package Test;

import Pages.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    @Test
    public void LoginTest() throws InterruptedException {
        PageFactory pageFactory = null;
        pageFactory.getLoginPage().login();
        pageFactory.getSystemPage().User();
    }
}