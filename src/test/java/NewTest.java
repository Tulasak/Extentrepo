import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest{
 // @SuppressWarnings("deprecation")
	public WebDriver driver;
@Test
  public void TestOne() throws InterruptedException {
	  
	WebDriverManager.chromedriver().setup();
	 ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(ops);
	
	driver.manage().window().maximize();
	Thread .sleep(2000);
	//driver.manage().timeouts().wait();
	//Assert.assertEquals(driver.findElement(By.xpath("//div[@id='lgheader']")).getText(),"SaralTDS Web [Version 15.0.2.0]");
	String st1=driver.findElement(By.xpath("//span[@id='lblVersion']")).getText();
	String st2="SaralTDS Web [Version 15.0.2.0]";	

	System.out.println("result"+st1);
	System.out.println("result"+st2);
	Assert.assertEquals(st1,st2);
	

  }
  
  @AfterMethod
  public void tearDown()
  
  
  {
	  driver.close();
  }




}
