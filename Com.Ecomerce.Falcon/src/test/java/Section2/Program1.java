package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
    Thread.sleep(3000);
    //Actions act=new Actions(driver);
    WebElement element = driver.findElement(By.xpath(""));

}

}
