package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {

	WebDriver driver;
	//Actions action = new Actions(driver);
	@Given("user opens signup page in TestMeApp")
	public void user_opens_signup_page_in_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder (5)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	    System.out.println("Registration Window opened");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
	   
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(username);
	    //System.out.println("");
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String firstname) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstname);
	    System.out.println("2");
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String lastname) {
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastname);
	    System.out.println("3");
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    System.out.println("4");
	}

	@When("user enters confirmpassword as {string}")
	public void user_enters_confirmpassword_as(String confirmpassword) {
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(confirmpassword);
	    System.out.println("5");
	}

	@When("user selects gender")
	public void user_selects_gender() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"gender\"]"))).click().build().perform();
	    System.out.println("6");
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) {
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(email);
	    System.out.println("7");
	}

	@When("user enters mobilenumber as {string}")
	public void user_enters_mobilenumber_as(String mobile) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(mobile);	   
	    System.out.println("8");
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(dob);
	    System.out.println("9");
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String address) {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(address);
	    System.out.println("10");
	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String answer) {
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(answer);
	    System.out.println("11");
	}

	@Then("user clicks register")
	public void user_clicks_register() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    System.out.println("12");
	}
	
}
