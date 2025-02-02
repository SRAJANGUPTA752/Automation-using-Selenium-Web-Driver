import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Goindigo {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update this path

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            // Navigate to the Indigo website
            driver.get("https://www.goindigo.in/");

            // Verify landing on the correct page
            String currentUrl = driver.getCurrentUrl();
            String pageTitle = driver.getTitle();
            System.out.println("Current URL: " + currentUrl);
            System.out.println("Page Title: " + pageTitle);
            try{
                driver.findElement(By.xpath("//*[@id=\"flight-close\"]")).click();
            }
              catch(NoAlertPresentException e) {
            System.out.println("Welcome to Indigo Page");
        }
        // Click on the "Book" option
        WebElement bookOption = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[1]/header/div/nav/div[1]")); // Update with correct locator
        bookOption.click();

        // Click on the "Flight" option
        WebElement flightOption = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[1]/header/div/nav/div[1]/div[1]/menu/li[1]/div/a[1]")); // Update with correct locator
        flightOption.click();

        // Click on the "1 pax" option
        WebElement onePaxOption = driver.findElement(By.xpath("/html/body/main/div/div/div/main/div/div/div/div/div/div[3]/div/div/div/section/div/div[1]/div[2]/div[1]/button")); // Update with correct locator
        onePaxOption.click();

        // Increase the count of Adul'Boots to 2 and click on Done
        WebElement adultCount = driver.findElement(By.xpath("/html/body/main/div/div/div/main/div/div/div/div/div/div[3]/div/div/div/section/div/div[1]/div[2]/div[2]/div[2]/label/div/button[2]")); // Update with correct locator
        adultCount.click();

        WebElement doneButton = driver.findElement(By.xpath("//*[text()='Done']")); // Update with correct locator
        doneButton.click();
        // Enter Hyderabad
        WebElement fromInput = driver.findElement(By.xpath("//*[@placeholder='From']")); // Update with correct locator
        fromInput.sendKeys("Hyderabad");
        // Enter Delhi
        WebElement toInput = driver.findElement(By.id("toCity")); // Update with correct locator
        toInput.sendKeys("Delhi");

        //date picker
        WebElement date= driver.findElement(By.xpath("//*[@placeholder='Travel Dates']"));
        date.click();

        //move to calender
        driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
        driver.findElement(By.xpath("/html/body/main/div/div/div/main/div/div/div/div/div/div[3]/div/div/div/section/div[1]/div[3]/div[3]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]")).click();
        driver.findElement(By.xpath("//*[text()='Search Flight']")).click();
        //select flight
        driver.findElement(By.xpath("//*[text()='Select']")).click();
        }

}
