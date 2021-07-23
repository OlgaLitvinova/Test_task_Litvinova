import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import static constants.Constants.*;

public class TaskTest extends BaseTestClass{
    HomePage homePage;

    @BeforeMethod
    public void beforeMethod() {
        driver.get(BASE_URL);
        homePage = new HomePage(driver);
    }

    @Test()
    public void successfulLogin() {
        Assert.assertEquals(homePage
                .clickLoginButton()
                .enterEmail(email)
                .clickEmailButton()
                .enterPassword(password)
                .clickPasswordButton()
                .getOkMessage(), expectedMessage);
    }

    @Test
    public void notCorrectLogin() {
        Assert.assertEquals(homePage
                .clickLoginButton()
                .enterEmail(notCorrectedEmail)
                .clickEmailButton()
                .getErrorEmailMessage(), expectedEmailError);
    }

    @Test
    public void notCorrectPassword() throws InterruptedException {
        Assert.assertEquals(homePage
                .clickLoginButton()
                .enterEmail(email)
                .clickEmailButton()
                .enterPassword(notCorrectedPassword)
                .clickPasswordButton()
                .getErrorPasswordMessage(), expectedPassError);
    }
}
