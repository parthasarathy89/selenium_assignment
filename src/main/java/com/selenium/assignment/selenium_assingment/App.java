package com.selenium.assignment.selenium_assingment;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.Thread;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","/Users/parthasarathysundararajan/Downloads/chromedriver-mac-arm64/chromedriver");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        
        WebDriver webDriver = new ChromeDriver(chromeOptions);
    	// Open FB url
        webDriver.get("https://www.facebook.com/");
        // Pass username
        webDriver.findElement(By.id("email")).sendKeys("donuserselenium@gmail.com");
        // Pass Password
        webDriver.findElement(By.id("pass")).sendKeys("Spar1989#");
        // Click Login
        webDriver.findElement(By.name("login")).click();
        Thread.sleep(30000);
        ///webDriver.findElement(By.xpath("//div[contains(@id,'userNavigationLabel')]")).click();
        ///Thread.sleep(20000);
        //
       /// webDriver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
        webDriver.close();
        System.out.println("Test case completed");
        
    }
}
