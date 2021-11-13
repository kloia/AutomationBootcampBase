package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        WebElement heading = driver.findElement(By.tagName("h1"));

        String text = heading.getText();

        System.out.println(text);
        driver.quit();
    }
}
