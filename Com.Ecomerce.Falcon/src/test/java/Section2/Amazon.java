package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s=new Select(element);
	s.selectByIndex(10);
	Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	element.sendKeys("books");
	element.submit();
	driver.findElement(By.xpath("id=\"a-autoid-0-announce\"")).click();
	

}
}
