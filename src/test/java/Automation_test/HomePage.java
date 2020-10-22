package Automation_test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.LandingPage;
import resources.base;

public class HomePage extends base{
	
	public  WebDriver driver;
	
	 
	@BeforeTest
	public void initialize() throws IOException
	{
	//to invoke browser
		 driver =initializeDriver();

	}
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		

		
		System.out.println("inside Home page navigation");
		String urlName=prop.getProperty("url");
		System.out.println(urlName);
		
		//driver.get(prop.getProperty("url"));
		driver.get(urlName);
		System.out.println("homePageNavigation_inProgress");
		
		//Applying Page factory pattern:
		
		LandingPage lp=new LandingPage(driver);
		
		lp.signIn().click();
		
		String userName=prop.getProperty("Username");
		String pwd=prop.getProperty("Password");
		//Thread.sleep(3000);
		lp.email().sendKeys(userName);
		lp.pwd().sendKeys(pwd);
		lp.logIn().click();
		
		//To assert Flights tab:
		WebElement Flights = driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]"));
		Assert.assertEquals(true, Flights.isDisplayed());
		System.out.println("Assert passed");
		
		//Below Code can be optimized by using pageFactory if given more time
		//To enter source in autosuggestive dropdown:
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[1]/div[1]/div[1]/div[1]/input[1]")).clear();
				//Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[1]/div[1]/div[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(prop.getProperty("source"));
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
				
				//To enter destination in autosuggestive dropdown:
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(prop.getProperty("destination"));
				//Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
				//select departure& return dates
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/jb-date-aggregator[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/jb-date-aggregator[1]/div[1]/div[2]/div[1]/jb-date-picker[1]/div[1]/div[1]/jb-month-viewer[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]/span[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/jb-date-aggregator[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/jb-date-aggregator[1]/div[1]/div[2]/div[1]/jb-date-picker[1]/div[1]/div[1]/jb-month-viewer[1]/div[1]/table[1]/tbody[1]/tr[5]/td[6]/div[1]/span[1]")).click();
				
				
				//select adults
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/div[1]/jb-traveler-selector[1]/div[1]/div[1]/button[1]/jb-icon[1]/*")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/div[3]/div[1]/jb-traveler-selector[1]/div[1]/div[2]/div[1]/jb-traveler-selector-options[1]/jb-traveler-selector-flights[1]/ul[1]/li[1]/jb-stepper[1]/div[1]/button[2]/jb-icon[1]/*")).click();
				//search flight
				
				driver.findElement(By.xpath("/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/div[1]/jb-booker-air-submit[1]/button[1]")).click();
				Thread.sleep(3000);
				
				
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		//Exit the browser
		//exiting browser since no flight found for selected dates:
		
		Thread.sleep(3000);
		driver.close();
		driver=null;
		
		//driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ul[1]/li[10]/a[1]/span[1]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/span[1]/span[1]")).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 3);
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		//presence in DOM
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ul[1]/li[10]/a[1]/span[1]")));

		//scrolling
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ul[1]/li[10]/a[1]/span[1]"));  
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		//clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ul[1]/li[10]/a[1]/span[1]")));*/
		
		
		
		
		
	}

}
