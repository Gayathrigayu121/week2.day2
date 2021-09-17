package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("gayathri");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("gayu");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("gs");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//select[@id='input-country']/option[4]")).click();
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("leaf@12 ");
		driver.findElement(By.xpath("//div[@class='bg-info']")).click();	
		
	}

}
