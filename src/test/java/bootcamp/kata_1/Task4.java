package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Elements")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
