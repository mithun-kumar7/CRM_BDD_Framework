/*
package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CRM_Deals_StepDefination {
	WebDriver driver;
	
			
		 @Given("^user is already on Login Page$")
		 public void user_already_on_login_page(){
		 System.setProperty("webdriver.chrome.driver","D:\\Testing_Material\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();		
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.get("https://www.freecrm.com/index.html");
		 }
		 
		 @When("^title of login page is Free CRM$")
		 public void title_of_login_page_is_free_CRM(){
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM", title);
		 }
		 
		 @Then("^user enters username and password$")
		 public void user_enters_username_and_password(DataTable credentials){
			List<List<String>> data = credentials.raw();
			driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
			driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
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
		 
		 
		 @Then("^user moves to new deal page$")
			public void user_moves_to_new_contact_page() throws Throwable {
				driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
			    }
		 
		 @Then("^user enters deal details$")
		 public void user_enters_contacts_details(DataTable dealData){
			 List<List<String>> dealValues =  dealData.raw();
			 driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
			 driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dealValues.get(0).get(0));
			 driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(dealValues.get(0).get(1));
			 driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(dealValues.get(0).get(2));
			 driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(dealValues.get(0).get(3));
		 }
		 
		 @Then("^Close the browser$")
		 public void close_the_browser(){
			 driver.quit();
		 }

}

*/
