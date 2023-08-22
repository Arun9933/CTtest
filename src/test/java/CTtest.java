
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class CTtest {
	@Test
	 void check1() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARUN\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
       

        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");  // Replace with your web app URL

      

        driver.quit();
		

	}

}
