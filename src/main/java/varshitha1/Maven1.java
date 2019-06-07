package varshitha1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven1 {
	@Test
	public void Test()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("done");
		
		
		}
}
