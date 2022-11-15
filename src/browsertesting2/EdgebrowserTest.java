package browsertesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgebrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.Edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //Launch the URL
        driver.get(baseUrl);

        //Maximise Window
        driver.manage().window().maximize();

        //we give implicit time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title=driver.getTitle();
        System.out.println("Page title is : " + title);

        // Get current URL
        System.out.println("Current URL;" + driver.getCurrentUrl());

        //Find the email field
        WebElement emailField =driver.findElement(By.name("username"));
        emailField.sendKeys("test123@gmail.com");

        //Find the pasword field
        WebElement PasswordField =driver.findElement(By.name("password"));
        PasswordField.sendKeys("test123");

        //close the browser
        driver.quit();
    }

}
