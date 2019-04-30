package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.beans.property.SetProperty;

public class SomeStep {
	WebDriver driver;
	
	
	
	@Given("^user is logging in$")
	public void user_is_logging_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VJIT\\eclipse\\BDDExample1\\src\\main\\java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("^title of login page is something$")
	public void title_of_login_page_is_something() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up",title);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys("vindhya789@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ammananna143@vin");
	   
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",loginbtn);
	   
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		Assert.assertEquals("Facebook", title);
	   
	}

}
