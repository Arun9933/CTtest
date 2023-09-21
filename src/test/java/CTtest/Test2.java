package CTtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test2 {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/webapp/");
    }

    @Test(priority = 1)
    public void testWelcomeMessage() {
        WebElement welcomeMessage = driver.findElement(By.tagName("h1"));
        assertEquals("Welcome To Bamboo", welcomeMessage.getText());
    }

    @Test(priority = 2)
    public void testLoginPageElements() {
        WebElement usernameInput = driver.findElement(By.name("uname"));
        WebElement passwordInput = driver.findElement(By.name("psw"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        assertTrue(usernameInput.isDisplayed());
        assertTrue(passwordInput.isDisplayed());
        assertTrue(loginButton.isDisplayed());
    }

    @Test(priority = 3)
    public void testSuccessfulLogin() throws InterruptedException {
        WebElement usernameInput = driver.findElement(By.name("uname"));
        WebElement passwordInput = driver.findElement(By.name("psw"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("Bamboo");
        Thread.sleep(1000);
        passwordInput.sendKeys("Bamboo");
        Thread.sleep(1000);
        loginButton.click();
        Thread.sleep(1000);

        // Add assertions here for a successful login scenario, if applicable
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
