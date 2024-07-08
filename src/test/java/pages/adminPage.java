package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminPage {

    public adminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "")
    public WebElement username;
}
