 package CTtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	 void check1() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/testapp/");  // Replace with your web app URL

        Thread.sleep(5000);

        driver.quit();
		

	}

}
