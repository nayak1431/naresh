package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TotalLogin 
{
		String bpath="http://apps.qaplanet.in/qahrm/login.php";
		WebDriver bo;
		@Parameters("browser")
		@BeforeTest 
		public void Crb(String br)
		{
		if(br.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\geckodriver.exe");
			bo= new FirefoxDriver();
			bo.get(bpath);
			System.out.println("running with fire");
				
		}
		else if(br.equalsIgnoreCase("glg"))	
		{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET1\\Downloads\\jarfiles\\chromedriver.exe");
			bo= new ChromeDriver();
			bo.get(bpath);
			System.out.println("running with gooogle");
		}
		}
		
		
		//with valid Login name and valid password
		@Test
		void Tc1_1() throws InterruptedException
		{
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.getTitle(),"OrangeHRM");
			bo.close();
		}
		//with valid Login name and invalid password
		@Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
	    void Tc1_2() throws InterruptedException
	    {
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
			Thread.sleep(3000);
			bo.close();
	    }
		//with invalid Login name and valid password
		@Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
	    void Tc1_3() throws InterruptedException
	    {
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet");
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			Thread.sleep(3000);
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
			Thread.sleep(3000);
			bo.close();
	    }
		//with blank Login name and blank password
	     @Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
		 void Tc1_4() throws InterruptedException
		    {
				bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Assert.assertEquals(bo.switchTo().alert().getText(),"User Name and Password not given!");
				bo.switchTo().alert().accept();
				Thread.sleep(4000);
				bo.close();	
		    }
	   //Blank value and valid
	     @Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
		 void Tc1_5() throws InterruptedException
		    {
				bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Assert.assertEquals(bo.switchTo().alert().getText(),"User Name not given!");
				bo.switchTo().alert().accept();
				Thread.sleep(4000);
				bo.close();	
		    }
	   //valid and Blank value
	     @Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
		 void Tc1_6() throws InterruptedException
		 {
				bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='Submit']")).click();
				Assert.assertEquals(bo.switchTo().alert().getText(),"Password not given!");
				bo.switchTo().alert().accept();
				Thread.sleep(4000);
				bo.close();	
		    }
	   //verify functionality of 'clear' Button
	     @Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
		 void Tc1_7() throws InterruptedException
		    {
				bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("sasdS");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("sdfaf");
				Thread.sleep(3000);
				bo.findElement(By.xpath("//input[@name='clear']")).click();
				Assert.assertEquals(bo.findElement(By.xpath("//input[@name='txtUserName']")).findElement(By.xpath("//input[@name='txtPassword']")).getText(),"");
				Thread.sleep(4000);
				bo.close();	
		    }
	     //verify functionality of 'OrangeHRM' Link
	     @Test(enabled=true, priority=1,dependsOnMethods="Tc1_1")
		  void TC_8() throws InterruptedException
		{
			bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
			bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//By using window handles
				 Set<String> s1=bo.getWindowHandles();
				 Iterator<String> i1=s1.iterator();
				 String mainwindow =i1.next();
				 String ChildWindow=i1.next();
				 Assert.assertEquals(bo.switchTo().window(ChildWindow).getTitle(), "HR Management System | HR Management Software | OrangeHRM");
				 Thread.sleep(3000);
				 bo.quit();
		  }

	}

