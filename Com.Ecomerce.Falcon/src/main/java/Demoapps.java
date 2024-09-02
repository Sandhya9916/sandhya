import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demoapps {
public static void main(String[] args)  throws Exception{
WebElement element = null;
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(3000);
driver.get("https://demoapps.qspiders.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//section[text()='Link']")).click();
Thread.sleep(3000);
List<WebElement> allLinks=driver.findElements(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']"));
Iterator
}
