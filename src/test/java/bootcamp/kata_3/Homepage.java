package bootcamp.kata_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement countryIcon;

    @FindBy(xpath = "//span[text()='Account']")
    public WebElement accountMenu;

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;

    @FindBy(linkText = "Create Account")
    public WebElement createAccount;









}
