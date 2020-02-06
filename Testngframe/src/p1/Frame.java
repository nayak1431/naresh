package p1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Frame {
	  
	WebDriver driver;
	
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
  @Test(enabled=true,priority=1,groups="login")
  
  
  
  //valid&valid
  
  
  public void tc2_1() {
	  
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
  }
  @Test(enabled=true,priority=2,groups="login")

  
  //valid&invalid
  
  
  public void tc2_2(){
	 
	  
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	 
	  }
  @Test(enabled=true,priority=3,groups="login")
  
  
  //invalid&valid
  
  public void tc2_3(){
	  
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	  
	  
  }
  
  @Test(enabled=true,priority=4,groups="login")
  
  //invalid&invalid
  
  
  public void tc2_4(){
	  
	  
	  
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
  }
  @Test(enabled=true,priority=5,groups="admin")
 
  //valid&valid
  
  
  public void tc2_5(){
	  
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  
  }
  @Test(enabled=true,priority=6,groups="login")
  
  public void tc3_6(){
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@name='clear']")).click();
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(bpath);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 driver.close();
	  
  }

}
