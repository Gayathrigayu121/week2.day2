package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		//Step 1 :Manage the driver
				WebDriverManager.chromedriver().setup();
				
				// Step 2: launch the browser
		          ChromeDriver obj=new ChromeDriver();
		        
		       //step3: Maximize the browser
		          obj.manage().window().maximize();
		          
		      //Step 4: Launch url
		          obj.get("http://www.leafground.com/pages/Dropdown.html");
		          
		          obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		        WebElement dropDown1=  obj.findElement(By.id("dropdown1"));
		        Select drop1=new Select(dropDown1);
		        drop1.selectByVisibleText("Appium");
		        
		        
//		        drop1.selectByIndex(1);
//		        drop1.selectByValue("4");
		        
		        
		        WebElement dropDown2=  obj.findElement(By.name("dropdown2"));
		        Select drop2=new Select(dropDown2);
		        drop2.selectByIndex(2);
		        
		        
		        WebElement dropDown3=  obj.findElement(By.id("dropdown3"));
		        Select drop3=new Select(dropDown3);
		        drop3.selectByValue("4");
		        
		        
	}

	
}
