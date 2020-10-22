package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

    @FindBy(xpath="//a[@class='main-nav-link avenir b white no-underline nowrap dib ng-star-inserted']")

    WebElement signIn;
    
    public LoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    
    public WebElement signIn(){

        return   signIn;

       }
}
