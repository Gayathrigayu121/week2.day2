package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//div[@id='label']/a")).click();
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
	    driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
//	    driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("01");
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("65");;
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    String hh=driver.findElement(By.xpath("//a[text()='10359']")).getText();
	    System.out.println("gettext "+hh);
	    driver.findElement(By.xpath("//a[text()='10359']")).click();
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item'] //input)")).sendKeys("10359");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  
	}

}
