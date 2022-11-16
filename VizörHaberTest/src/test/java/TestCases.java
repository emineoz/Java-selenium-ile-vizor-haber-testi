
import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;


    public class TestCases extends BaseTest {
        String title = "Vizör haber-Güncel Haberler";
        String email = "emine@gmail.com";
        String password = "123456";


        @Test
        public void VizörHaberTest() throws InterruptedException, IOException {
            LoginPage loginPage;
            String acountname = "emineeozz16@gmail.com";

            HomePage homePage = new HomePage(webDriver);
            String webDriverTitle = homePage.getHomePageTitle();
            Log4j.info("Title: " + webDriverTitle);
            assertEquals("Titles did not match", webDriverTitle, title);
            Log4j.info("Titles did match");
            loginPage = homePage.getLoginPage();
            Log4j.info("Go to Login Page");
            Log4j.info("your email: " + email + ", your password: " + password);
            User user = new User(email, password);
            if (email == "emine@gmail.com" && password == "123456") {
                WebElement emailbox = webDriver.findElement(By.id("inputEmail"));
                emailbox.sendKeys(email);
                WebElement passwordbox = webDriver.findElement(By.id("inputPassword"));
                passwordbox.sendKeys(password);
                WebElement loginbox = webDriver.findElement(By.xpath("/html/body/div[5]/div/div/form/button"));
                loginbox.click();
                Log4j.info("Email and password is true");


            } else {
                WebElement emailbox = webDriver.findElement(By.id("inputEmail"));
                emailbox.sendKeys(email);
                WebElement passwordbox = webDriver.findElement(By.id("inputPassword"));
                passwordbox.sendKeys(password);
                WebElement loginbox = webDriver.findElement(By.xpath("/html/body/div[5]/div/div/form/button"));
                loginbox.click();
                Thread.sleep(10);
                assertEquals("Email is not true", email, "emineeozz16@gmail.com");
                assertEquals("Password is not true", password, "E123456");
            }

            Log4j.info("Go to Home Page");
            String accountButtonText = homePage.getAccountText();
            Log4j.info("The text written on the My Account button is: " + accountButtonText);
            assertEquals("Account name is not true", acountname, "emineeozz16@gmail.com");
            Log4j.info("Account name is true");
            Thread.sleep(10);

             homePage.clickProduct();
             String producturl=webDriver.getCurrentUrl();
            assertEquals("Product details could not be accessed", producturl, "http://localhost:8000/product/5");
            Log4j.info("Product details could be accessed");

            homePage.clickContact();
            String contacturl=webDriver.getCurrentUrl();
            assertEquals("Product details could not be accessed", contacturl, "http://localhost:8000/contact");
            Log4j.info("Contact page could be accessed");

            homePage.clickaboutus();
            String aboutUsturl=webDriver.getCurrentUrl();
            assertEquals("Product details could not be accessed", aboutUsturl, "http://localhost:8000/aboutus");
            Log4j.info("About us page could be accessed");


             }


        }

