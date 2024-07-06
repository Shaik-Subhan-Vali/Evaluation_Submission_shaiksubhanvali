import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_Picker {
	//declaring driver globally
	WebDriver driver ;
	
	@BeforeTest
	public void setup() {
		//creating an instance of crhome driver.
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc1() throws InterruptedException {
		driver.findElement(By.id("datepicker1")).click();
		String mnth = "";
		String yr = "";
		
		//1st date picker 
		while(!(mnth.equals("May") && yr.equals("2025")))
		{
			 mnth = driver.findElement(By.cssSelector("span[class=\"ui-datepicker-month\"]")).getText();
			 yr = driver.findElement(By.cssSelector("span[class=\"ui-datepicker-year\"]")).getText();
			 driver.findElement(By.cssSelector("span[class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
		 driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and text()=\"1\"]")).click();
		
	}
	@Test
	public void tc2() throws InterruptedException {
		driver.findElement(By.id("datepicker2")).sendKeys("07/07/2025");
		
	
	}
	@AfterTest
	public void teardwon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
