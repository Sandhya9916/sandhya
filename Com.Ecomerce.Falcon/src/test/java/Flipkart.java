import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='q']"));
Thread.sleep(4000);
driver.findElement(By.xpath("//span[text()='Add to Compare'][1]"));
Thread.sleep(4000);
driver.findElement(By.xpath("//span[text()='Add to Compare'][2]"));
Thread.sleep(4000);
driver.findElement(By.xpath("//span[text()='Add to Compare'][23]"));
Thread.sleep(4000);
driver.findElement(By.xpath("//span[text()='Add to Compare'][24]"));




}
}
