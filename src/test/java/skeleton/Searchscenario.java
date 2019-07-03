package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchscenario {

	WebDriver driver;
	
	@Given("user opens signinnn page in TestMeApp")
	public void user_opens_signinnn_page_in_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	}

	@When("user enters usernameee as {string}")
	public void user_enters_usernameee_as(String usernameee) {
	    
		 //System.out.println("Username and password");
		    WebElement userid= driver.findElement(By.xpath("//*[@id=\"userName\"]"));
			userid.sendKeys(usernameee);
			
		    
	}

	@When("user enters passworddd as {string}")
	public void user_enters_passworddd_as(String passworddd) {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(passworddd);
	    
	}
	@When("click loginnn")
	public void click_loginnn() {
	    
		WebElement submit=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		submit.click();
		
	}
	@When("user opens the home page after login")
	public void user_opens_the_home_page_after_login() {
	    
		//System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		System.out.println("1");
		
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
	    
	    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	    
	}

	@When("user enters productname as {string}")
	public void user_enters_productname_as(String productname) {
	    
		WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		search.click();
		search.sendKeys(productname);
		//search.clear();
		//Actions action = new Actions(driver);
		//action.sendKeys(search,Keys.BACK_SPACE);
		//search.sendKeys("Wea");
		
	}

	@When("user clicks product")
	public void user_clicks_product() {
	    Actions action = new Actions(driver);
	    WebElement search1=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	   // action.sendKeys(search1,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    //action.moveToElement(search1).click().build().perform();
	    
	    
	}

	@Then("user clicks finddetails button")
	public void user_clicks_finddetails_button() {
	    
	    WebElement finddetails=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
	    finddetails.click();
		
	}

	
}
