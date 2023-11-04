package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class all {
	WebDriver driver;
	@Given("^Open school application$")
	public void open_school_application() throws Throwable {
System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		 driver = new ChromeDriver();
		driver.get("https://fancy-pika-6b453f.netlify.app/");
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		    
	}

	@Then("^Verify Notice link display in home page$")
	public void verify_Notice_link_display_in_home_page() throws Throwable {
	boolean notice = driver.findElement(By.linkText("Notice")).isDisplayed();
	 Assert.assertTrue(notice);
	 Thread.sleep(2000);
	  driver.close();
	}

	@Then("^Click Notice link$")
	public void click_Notice_link() throws Throwable {
	WebElement cl =	driver.findElement(By.linkText("Notice")); 
	cl.click();
	Thread.sleep(1000);
	}

	@Then("^Verify Notice page display$")
	public void verify_Notice_page_display() throws Throwable {
	   
	boolean display =	driver.findElement(By.xpath("//h1[text()='Notice']")).isDisplayed();
		Assert.assertTrue(display);
		Thread.sleep(2000);
		driver.close();
		
		
	}
	@Then("^Click Notice Link$")
	public void click_Notice_Link() throws Throwable {
	  
		WebElement cl =	driver.findElement(By.linkText("Notice")); 
		cl.click();
		Thread.sleep(1000);	
		
		
	}
	@Then("^Verify Notice Board display in Notice page$")
	public void verify_Notice_Board_display_in_Notice_page() throws Throwable {
	 ((JavascriptExecutor)driver).executeScript("scroll(0,300)"); 
	boolean notic =	driver.findElement(By.xpath("//h1[text()='Notice Board']")).isDisplayed();
		Assert.assertTrue(notic);
		Thread.sleep(2000);
		driver.close();
		
	}
	@Then("^Click notice Link$")
	public void click_notice_Link() throws Throwable {
		WebElement cl =	driver.findElement(By.linkText("Notice")); 
		cl.click();
		Thread.sleep(1000);	
		 
	}
	@Then("^Verify (\\d+) information\\(TITLE, DATE, VIEW\\)display in Notice Board$")
	public void verify_information_TITLE_DATE_VIEW_display_in_Notice_Board(int arg1) throws Throwable {
	    
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
	boolean page = driver.findElement(By.xpath("//th[text()='Date']")).isDisplayed();
		Assert.assertTrue(page);
		Thread.sleep(2000);
		driver.close();
	}
	@Then("^Click notice link$")
	public void click_notice_link() throws Throwable {
	 
		WebElement cl =	driver.findElement(By.linkText("Notice")); 
		cl.click();
		Thread.sleep(1000);	
	}

	@Then("^Click view$")
	public void click_view() throws Throwable {
	    
	}

	@Then("^Verify Notice details display when click view$")
	public void verify_Notice_details_display_when_click_view() throws Throwable {
	   
	}


}
