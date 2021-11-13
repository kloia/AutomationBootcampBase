package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/forgot_password");


        WebElement inputBox = driver.findElement(By.id("email"));

        inputBox.sendKeys("selcuk@kloia.com");
        Thread.sleep(2000);
        driver.quit();
    }
}
