package UIAutomation_Master.UIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
  public static void main(String[] args) {
	  
	  
	  
	  String driverPath = System.getProperty("user.dir") + "/src/main/java/resources/chromedriver.exe";
	  
  
	 // System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Learning\\2021-2022_LP\\02. Work Spaces\\UIAutomation\\src\\main\\java\\resources\\chromedriver.exe");
	 
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  
	  
	  driver.get("https://login.salesforce.com/?locale=in");
	  
	  driver.manage().window().maximize();
	  
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println(driver.getTitle());
	  String homePage = driver.getWindowHandle();
	  
	  System.out.println("home page handle: "+ homePage);
	  
	  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Dummy");
	  
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
	  
	  
	  driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
	  
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	  
	  
	  

	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  String errorMessage = driver.findElement(By.xpath("//*[@id='error']")).getText();
	  
	  System.out.println(errorMessage);
	  
	  driver.quit();
	  
	  
	  
  }
}
