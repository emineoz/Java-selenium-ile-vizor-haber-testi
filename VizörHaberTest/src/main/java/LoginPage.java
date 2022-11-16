import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By userNameFieldBy = By.id("inputEmail");
    By passwordFieldBy = By.id("inputPassword");
    By loginButtonBy = By.xpath("/html/body/div[5]/div/div/form/button");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(User user) {
        sendKeys(userNameFieldBy, user.getEmail());
        sendKeys(passwordFieldBy, user.getPassword());
        click(loginButtonBy, 5);
        HomePage homePage = new HomePage(webDriver);
        homePage.waitForLoad();
        return homePage;
    }
}