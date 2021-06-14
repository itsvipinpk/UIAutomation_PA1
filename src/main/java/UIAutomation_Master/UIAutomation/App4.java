package UIAutomation_Master.UIAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App4 {
	public static void main(String[] args) throws Exception {

		String driverPath = System.getProperty("user.dir") + "/src/main/java/resources/chromedriver.exe";

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Personal\\Learning\\2021-2022_LP\\02. Work
		// Spaces\\UIAutomation\\src\\main\\java\\resources\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		List <WebElement> countryOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option : countryOptions)
			{
				if(option.getText().equalsIgnoreCase("INDIA"))
					System.out.println("Matched country is "+option.getText());
					option.click();
					break;
			}
		
		driver.quit();

	}
}
