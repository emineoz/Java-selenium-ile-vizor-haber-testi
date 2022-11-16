

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    By mainScreen = By.className("f2lc5a-0");
    By productbox=By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/a");
    By contactbox=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/a[7]");
    By aboutUsbox=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/a[8]");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getHomePageTitle(){
        return webDriver.getTitle();
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainScreen));
    }

    public void clickProduct() {
        webDriver.findElement(productbox).click();

    }

    public void clickContact() {
        webDriver.findElement(contactbox).click();

    }
    public void clickaboutus() {
        webDriver.findElement(aboutUsbox).click();

    }

}
