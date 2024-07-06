import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_Over {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		//creating an instance of chrome driver.
		driver = new ChromeDriver();
		//Navigating to url and maximizing the page
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc1() throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("//li/a[@href=\"https://www.ebay.com/b/Electronics/bn_7000259124\"]"));
		
		WebElement fashion = driver.findElement(By.xpath("//li/a[@_sp=\"p4375194.m1381.l3250\"]"));
		WebElement refurbished = driver.findElement(By.xpath("(//h3[@class=\"vl-popular-destinations-evo__name\"])[4]"));
		
		act.moveToElement(electronics).build().perform();
		Thread.sleep(2000);
		act.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		act.moveToElement(refurbished).build().perform();
		Thread.sleep(2000);
		
		
	}
	
	@AfterTest
	public void teardwon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
