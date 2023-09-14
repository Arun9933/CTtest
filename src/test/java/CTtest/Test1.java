package CTtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Test1 {
    @Test
    void check1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080/testapp/");
            Thread.sleep(2000);

            WebElement welcomeMessage = driver.findElement(By.tagName("h1"));

            assertEquals("Welcome To Bamboo", welcomeMessage.getText());

            WebElement usernameInput = driver.findElement(By.name("uname"));

            WebElement passwordInput = driver.findElement(By.name("psw"));

            WebElement loginButton = driver.findElement(By.tagName("button"));

            usernameInput.sendKeys("Bamboo");
            Thread.sleep(1000);
            passwordInput.sendKeys("Bamboo");
            Thread.sleep(1000);
            loginButton.click();
            Thread.sleep(1000);



        } finally {

            driver.quit();
        }
    }
}
