import org.openqa.selenium.WebDriver;

public class Selenium6 {
public static void main(String[] args)throws Exception
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/");


}
