package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Flipkart1 {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
	act.moveToElement(ele).perform();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\screenshot\\"+"ss1"+".png");
	Files.copy(src, dest);
	System.out.println("taken screenshot");
    driver.switchTo();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}











