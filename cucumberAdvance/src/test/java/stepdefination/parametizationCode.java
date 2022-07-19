package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class parametizationCode {
	WebDriver driver=null;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside: User is on login page ");
		  WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		 //   WebDriverManager.edgedriver().setup();
		//    driver=new EdgeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		    driver.manage().window().maximize();
		    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^User enters ([^\"]*) and ([^\"]*)$")
	public void user_enters_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: user enters" + username + password);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		
	}

	@When("clicks on login button")
	public void click_on_loin_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: click on login page");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		Thread.sleep(2000);
	}

	@Then("^user is navigated to the home and select ([^\"]*)$")
	public void user_is_navigated_to_home(String country) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: user is navigated to home and the country is"+ country);
		//selecting country India
	//	Select country1 = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
	//	country1.selectByVisibleText(country);
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys(country);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		driver.quit();
	}

}