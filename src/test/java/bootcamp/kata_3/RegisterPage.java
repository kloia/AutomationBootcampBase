package bootcamp.kata_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {


    public RegisterPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    public WebElement title;



}
