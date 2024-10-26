package UmaTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
WebDriver driver;
	
	
  @Test
  void OpenURL() throws InterruptedException {
	  
		driver=new ChromeDriver();
		driver.get("https://registry.verra.org/");
		System.out.println("Verra Webpage Opened");
		driver.manage().window().maximize();	  
  }
  
  @Test(priority=2)
  void Test1()
  {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@role='button']")).click();
		System.out.println("PUBLIC REPORT got clicked");
  }
  
  @Test(priority=3)
  void Test2()
  {
	  driver.findElement(By.xpath("//a[@href='/app/search/VCS']//span")).click();
	  System.out.println("VERIFIED CARBON STANDARD got clicked");
	  	  
  }
  
  @Test(priority=4)
  void Test3() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@id='search_sel_id']")).sendKeys("1050");
		Thread.sleep(5000);	
		System.out.println("Text entered");
  }
  
  @Test(priority=5)
  void Test4()
  {
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  System.out.println("Searchbutton got clicked");
	  String text=driver.findElement(By.xpath("//td[7]")).getText();	
	  System.out.println("Text got retuned..."+text);
	  if(text.equals(text)) 
	  {
		  System.out.println("Test Pass");
	  }
	  else
	  {
		  System.out.println("Test Fail");
	  }
	  
	  
	  driver.close();
	  
  }
  
   
  
  
}
