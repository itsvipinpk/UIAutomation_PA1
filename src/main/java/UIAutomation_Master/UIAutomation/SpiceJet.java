package UIAutomation_Master.UIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



//Test to search one way flights.

public class SpiceJet {
	public static void main(String[] args) throws Exception {

		String driverPath = System.getProperty("user.dir") + "/src/main/java/resources/chromedriver.exe";

	
		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		
		
		//Select the trip.
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		
		
		//Select from place
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(1000);
		
		//select to place
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCJ']")).click();
		
		//select from date.
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		//number of passengers
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement passengerCount = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select select = new Select(passengerCount);
		select.selectByVisibleText("3");
		Thread.sleep(2000);
		
		
		//currency
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
				
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				
		Select selectCurrency = new Select(currency);
		selectCurrency.selectByVisibleText("USD");
		
		Thread.sleep(3000);
		
		Assert.assertFalse(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style").contains("0.5"));
		
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}
}
