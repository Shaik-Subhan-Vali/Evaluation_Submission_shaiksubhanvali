import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB_Signup {
	WebDriver driver ;
	
	@BeforeTest
	public void setup() {
		//creating an instance of chrome driver.
		driver = new ChromeDriver();
		//Navigating to url and maximizing the page
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc1() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Izuku");
		driver.findElement(By.name("lastname")).sendKeys("Midoriya");
		WebElement day = driver.findElement(By.id("day"));
		WebElement mnth = driver.findElement(By.id("month"));
		WebElement yr = driver.findElement(By.id("year"));
		Select s1 = new Select(day);
		s1.selectByIndex(1);
		Select s2 = new Select(mnth);
		s2.selectByIndex(1);
		Select s3 = new Select(yr);
		s3.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();
		driver.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("7989335677");
		driver.findElement(By.id("password_step_input")).sendKeys("Izuku@777");
		
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		
		Thread.sleep(3000);
	}
	
	@AfterTest(enabled = false)
	public void teardwon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
