package bootcamp.kata_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SimpleTests {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teardown(){
        driver.quit();
    }


    @Test
    public void firstTest(){

        driver.findElement(By.linkText("A/B Testing")).click();
        String title = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals("A/B Test Variation 1", title);
    }

    @Test
    public void loginTest(){
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String actualTitle = driver.findElement(By.className("subheader")).getText();
        String expectedTitle = "Welcome to the Secure Area. When you are done click logout below.";
        WebElement logoutButton = driver.findElement(By.className("icon-signout"));
        Assert.assertEquals(expectedTitle, actualTitle);
        Assert.assertTrue(logoutButton.isDisplayed());
    }


    @Test
    public void loadTest() {
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 2: ")).click();
        driver.findElement(By.cssSelector("#start button")).click();

        String myText = driver.findElement(By.cssSelector("#finish>h4")).getText();

        Assert.assertEquals("Hello World!", myText);


    }

    @Test
    public void loadTest2() {
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 1: ")).click();
        driver.findElement(By.cssSelector("#start button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loading = driver.findElement(By.id("loading"));

        wait.until(ExpectedConditions.invisibilityOf(loading));

        String myText = driver.findElement(By.cssSelector("#finish>h4")).getText();

        Assert.assertEquals("Hello World!", myText);


    }









}
