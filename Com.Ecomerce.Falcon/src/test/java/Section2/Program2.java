package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/link/contact?sublist=0");
	driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//section[text()='Time Picker'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@placeholder='hh:mm aa']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='10:30 AM']")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
}
}
