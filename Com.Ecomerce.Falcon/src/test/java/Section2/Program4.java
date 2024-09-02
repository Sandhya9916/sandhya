package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program4 {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//span[text()='From']"));
	element.sendKeys("blr");
	element.submit();
	Select s=new Select(element);
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='BLR']")).click();
	WebElement element1= driver.findElement(By.xpath("//span[text()='To']"));
	element.sendKeys("DxB");
	element.submit();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='DXB']"));
	
	
	
	
	
	
}
}
