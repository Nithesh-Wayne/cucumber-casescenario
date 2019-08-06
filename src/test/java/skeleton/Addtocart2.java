package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocart2 {

	
	WebDriver driver;
	@Given("user opens signinnnn page in TestMeApp")
	public void user_opens_signinnnn_page_in_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@When("user enters usernameeee as {string}")
	public void user_enters_usernameeee_as(String usernameeee) {
	    
		WebElement userid= driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		userid.sendKeys(usernameeee);
	}

	@When("user enters passwordddd as {string}")
	public void user_enters_passwordddd_as(String passwordddd) {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(passwordddd);
	    
	}

	@When("click loginnnn")
	public void click_loginnnn() {
	    
		WebElement submit=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		submit.click();
	}

	@When("user opens the home page after loginn")
	public void user_opens_the_home_page_after_loginn() {
	    
		System.out.println("1");

	}

	@When("user clicks on search buttonn")
	public void user_clicks_on_search_buttonn() {
	    
	    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();

	}

	@When("user enters productnamee as {string}")
	public void user_enters_productnamee_as(String productnamee) {
	    
		WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		search.click();
		search.sendKeys(productnamee);
	}

	@When("user clicks productt")
	public void user_clicks_productt() {
		Actions action = new Actions(driver);
	    WebElement search1=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	    //action.sendKeys(search1,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    
	}

	@When("user clicks finddetailss button")
	public void user_clicks_finddetailss_button() {
		  WebElement finddetails=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		    finddetails.click();
	    
	}

	@Then("user clicks addtocart button")
	public void user_clicks_addtocart_button() {
	    
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
		cart.click();
		if(driver.getTitle().equals("View Cart"))
		// We are using the hard assert
		{
			Assert.assertFalse(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
		
	    
	}
	
}
