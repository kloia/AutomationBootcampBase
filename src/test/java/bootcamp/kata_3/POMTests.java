package bootcamp.kata_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class POMTests {


    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void pomExample(){

        Homepage homepage = new Homepage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        homepage.countryIcon.click();
        homepage.closeButton.click();
        homepage.accountMenu.click();
        homepage.createAccount.click();

        String text = registerPage.title.getText();

        Assert.assertEquals("Create an Account", text);


    }

}
