/*
package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CRM_login_stepDefination {
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Material\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();		
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.get("https://www.freecrm.com/index.html");
	  
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM", title);
	   
	}

	
	
	//Regular Expression:
		 //1. \"([^\"]*)\"
		 //2. \"(.*)\"
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		WebElement loginBtn =
				 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
				 
	   
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRM", title);
	    
	}
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	    
	   
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String middlename, String lastname) throws Throwable {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys(middlename);		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
	   
	    
	}

	@Then("^Close the browser$")
	public void Close_the_browser() throws Throwable {
		driver.quit();
	    
	}

}

*/