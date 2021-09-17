package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//div[@id='label']/a")).click();
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Test@gmail.com");
   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a")).click();
String hh=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a\"")).getText();
//driver.findElement(By.xpath("//a[text()='10182']")).click();
System.out.println("The name is ..= "+hh);
	    driver.findElement(By.xpath("//div[@class='x-grid3-row   ']")).click();
	    driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	    
	    System.out.println("the title of the page is = "+driver.getTitle());
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    String name=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	    System.out.println("The name is ..= "+name);

	}

}
