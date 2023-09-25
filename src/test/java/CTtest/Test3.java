package CTtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Test3 {
    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/testapp1/");
    }

    @Test(description = "Critical Functionality: User Registration", priority = 1)
    void registerUser() throws InterruptedException {
        // Registration Form Testing
        WebElement regUsernameInput = driver.findElement(By.name("reg-username"));
        WebElement regPasswordInput = driver.findElement(By.name("reg-password"));
        WebElement regEmailInput = driver.findElement(By.name("reg-email"));
        WebElement registerButton = driver.findElement(By.tagName("button"));

        regUsernameInput.sendKeys("BambooUser");
        Thread.sleep(1000);
        regPasswordInput.sendKeys("BambooPassword");
        Thread.sleep(1000);
        regEmailInput.sendKeys("bamboo@example.com");
        Thread.sleep(1000);
        registerButton.click();
        Thread.sleep(1000);
    }
    
    
    @Test(description = "Critical Functionality: User Login", priority = 2)
    void loginUser() throws InterruptedException {
        // Login Form Testing
        WebElement usernameInput = driver.findElement(By.name("uname"));
        WebElement passwordInput = driver.findElement(By.name("psw"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("BambooUser");
        Thread.sleep(1000);
        passwordInput.sendKeys("BambooPassword");
        Thread.sleep(1000);
        loginButton.click();
        Thread.sleep(1000);

        // Assertion for successful login
        WebElement welcomeMessage = driver.findElement(By.tagName("h1"));
        assertEquals("Welcome To Bamb", welcomeMessage.getText());
    }
    
    

    @Test(description = "NonCr Functionality: Change Theme", priority = 3)
    void changeTheme() throws InterruptedException {
        // Change Theme Testing
        WebElement themeSelect = driver.findElement(By.id("theme"));
        Select select = new Select(themeSelect);
        select.selectByValue("dark");
        Thread.sleep(1000);

        // Add assertion to validate theme change (non-critical functionality)
        WebElement body = driver.findElement(By.tagName("body"));
        assertEquals("dark-theme", body.getAttribute("class"));
    }


    
    @Test(description = "NonCr Functionality: User Profile Update", priority = 4)
    void userProfileUpdate() throws InterruptedException {
        // User Profile Update Testing
        WebElement bioTextarea = driver.findElement(By.name("bio"));
        WebElement phoneInput = driver.findElement(By.name("phone"));
        WebElement saveChangesButton = driver.findElement(By.xpath("//button[text()='Save Changes']"));

        // Update the bio and phone input fields
        bioTextarea.sendKeys("Updated bio information");
        phoneInput.sendKeys("1234567890");

        // Click the "Save Changes" button
        saveChangesButton.click();

        // Add assertions to verify the functionality
        // For example, you can assert that the bio and phone input fields have the expected values
        assertEquals("Updated bio information", bioTextarea.getAttribute("value"));
        assertEquals("1234567890", phoneInput.getAttribute("value"));
    }


    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
