package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@placeholder='Username']"))
	.sendKeys("Admin", Keys.TAB,"admin123",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='Leave']")).click();
	driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]")).click();
	Thread.sleep(3000);
	Robot r = new Robot();
	for(int i=1;i<=5;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//div[text()='CAN - Vacation']")).click();
		
	}

	
}

