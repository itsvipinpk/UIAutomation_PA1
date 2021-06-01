package UIAutomation_Master.UIAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
  public static void main(String[] args) {
	  
	  
	  
	  String driverPath = System.getProperty("user.dir") + "/src/main/java/resources/chromedriver.exe";
	  
  
	 // System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Learning\\2021-2022_LP\\02. Work Spaces\\UIAutomation\\src\\main\\java\\resources\\chromedriver.exe");
	 
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  
	  
	  driver.get("https://www.google.co.in/");
	
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  driver.manage().window().maximize();
	  String pageTitle = driver.getTitle();
	  System.out.println(pageTitle);
	  driver.quit();
	  
	  
  }
}
