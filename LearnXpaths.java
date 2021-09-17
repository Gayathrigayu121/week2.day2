package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpaths {

	public static void main(String[] args) {
		//Step 1 :Manage the driver
				WebDriverManager.chromedriver().setup();
				
				// Step 2: launch the browser
		          ChromeDriver obj=new ChromeDriver();
		        
		       //step3: Maximize the browser
		          obj.manage().window().maximize();
		          
		      //Step 4: Launch url
		          obj.get("http://leaftaps.com/opentaps/control/main");
		          
		      //step 5:get the title of the current page
		          String title = obj.getTitle();
		          System.out.println("title = "+title);
		          
		          
		          obj.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		          
		          
		          
		          obj.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		          
		          
		          obj.findElement(By.xpath("//input[@type='submit']")).click();
		          
	
	
		          
	}

}
