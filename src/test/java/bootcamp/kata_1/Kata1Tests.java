package bootcamp.kata_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kata1Tests {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.tr");
        driver.get("https://kloia.com");
        driver.navigate().back();
        driver.quit();

    }

}
