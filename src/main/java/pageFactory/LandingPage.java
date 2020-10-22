package pageFactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
public class LandingPage {
	
	WebDriver driver;

    @FindBy(xpath="//a[@class='main-nav-link avenir b white no-underline nowrap dib ng-star-inserted']")

    WebElement signIn;
    
    @FindBy(xpath="/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-sign-in-page[1]/div[1]/div[2]/div[1]/jb-trueblue[1]/div[1]/jb-tb-login[1]/form[1]/div[1]/input[1]")
    
    WebElement email;
    
    @FindBy(xpath="/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-sign-in-page[1]/div[1]/div[2]/div[1]/jb-trueblue[1]/div[1]/jb-tb-login[1]/form[1]/div[2]/input[1]")
    
    WebElement pwd;
    
    @FindBy(xpath="//button[@class='w-100 tc center copy-xs bg-royal-blue white pa3 mb3 b ba br6 pa0 pointer justify-center items-center']")
    WebElement logIn;
    
    public LandingPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    
    public WebElement signIn(){

        return   signIn;

       }

    public WebElement email(){

        return   email;

       }
    public WebElement pwd(){

        return   pwd;

       }
    
    public WebElement logIn(){

        return   logIn;

       }
}
