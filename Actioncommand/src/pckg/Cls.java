package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.hdfcbank.com/");
		Actions acr=new Actions(bo);
	    acr.moveToElement(bo.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a"))).perform();
		Thread.sleep(3000);
		acr.moveToElement(bo.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[2]/a"))).perform();
	   Thread.sleep(3000);
	  bo.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[2]/div[2]/div/ul/li[2]/a")).click();
		//JavascriptExecutor js = (JavascriptExecutor) dd;
		 //js.executeScript("window.scrollBy(0,250)");
		/*dd.navigate().refresh();
		dd.navigate().to("https://www.redbus.in/");
		dd.navigate().back();
		dd.navigate().forward();
		dd.close();*/

	}

}
