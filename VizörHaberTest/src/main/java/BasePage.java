import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class BasePage extends WebDriverHelper {
        Actions actions = new Actions(webDriver);
        WebElement loginOrRegisterButtonBy = webDriver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/li[2]/div/a"));
        By accountname=By.xpath("//*[@id=\"navbarCollapse\"]/div/li[2]/div/a");
        By loginButtonBy = By.xpath("//*[@id=\"navbarCollapse\"]/div/li[2]/div/div/a[1]");
        By searchBoxBy = By.className("sc-4995aq-0");

        public BasePage(WebDriver webDriver) {
            super(webDriver);
        }

        public LoginPage getLoginPage(){
            actions.moveToElement(loginOrRegisterButtonBy).perform();
            click(loginButtonBy, 10);
            return new LoginPage(webDriver);
        }
        public String getAccountText(){

            return getText(accountname);
        }
}
