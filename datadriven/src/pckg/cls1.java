package pckg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class cls1 {
	  @Test(dataProvider = "LoginCredentials")
	  public void TC1(String uid, String pd) {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
		    WebDriver  bo=new ChromeDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys(uid);
		    bo.findElement(By.name("txtPassword")).sendKeys(pd);
		   bo.findElement(By.name("Submit")).click();
		   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		   bo.close();  
	  }

	  @DataProvider
	  public Object[][] LoginCredentials() { 
		  Object[][] Cred = new Object[4][2];                  
	  Cred[0][0] = "qaplanet1";
	  Cred[0][1] = "lab1";

	  Cred[1][0] = "qaplanet1";
	  Cred[1][1] = "lab1";

	  Cred[2][0] = "qaplanet1";
	  Cred[2][1] = "lab1";

	  Cred[3][0] = "qaplanet1";
	  Cred[3][1] = "lab1";
	  return Cred;
    }
  }

