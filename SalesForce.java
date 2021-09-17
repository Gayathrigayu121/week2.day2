package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("ghf");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("d");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("dsgf@gmail.com");
		driver.findElement(By.xpath("//select[@name='UserTitle']/option[4]")).click();
		driver.findElement(By.xpath(" //select[@name='CompanyEmployees']/option[4]")).click();
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9942379161");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("dfghb");
		driver.findElement(By.xpath("//select[@name='CompanyCountry']/option[3]")).click();	
		
	}

}
