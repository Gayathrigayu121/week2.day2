package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Acme {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title=driver.getTitle();
		System.out.println("title of the page ="+title);
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
	}

}
