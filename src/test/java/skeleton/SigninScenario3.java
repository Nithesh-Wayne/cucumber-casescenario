package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninScenario3 {

	WebDriver driver;

	@Given("user opens signinn page in TestMeApp")
	public void user_opens_signinn_page_in_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	}

	@When("user enters usernamee as {string}")
	public void user_enters_usernamee_as(String usernamee) {
	    
		 //System.out.println("Username and password");
		    WebElement userid= driver.findElement(By.xpath("//*[@id=\"userName\"]"));
			userid.sendKeys(usernamee);
			
		    
	}

	@When("user enters passwordd as {string}")
	public void user_enters_passwordd_as(String passwordd) {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(passwordd);
	    
	}

	@Then("click loginn")
	public void click_loginn() {
	    
		WebElement submit=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		submit.click();
		
	}

	
}
