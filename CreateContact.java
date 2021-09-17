package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	    driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("gayathri");
	    driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("gayi");
	    driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("swd");
	    driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("saef");
	    driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("safweq");
	    driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("afwqetgreg");
	    driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("afsg@gmail.com");
	    WebElement dropdown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select drop=new Select(dropdown);
	    drop.selectByVisibleText("Arkansas");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	    driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("dasggfghfhgsg");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    String title=driver.getTitle();
	    System.out.println("title of the last page = "+title);
	}

}
