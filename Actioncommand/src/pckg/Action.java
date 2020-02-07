package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
	    bo.get("https://www.hdfcbank.com/");
		
        Actions acr=new Actions(bo);
	
		acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/d1]/a[1]"))).perform();
		Thread.sleep(4000);
		acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/dli[3]/a[1]"))).perform();
		Thread.sleep(4000);
		acr.moveToElement(bo.findElement(By.xpath("/html/ul[1][1]/li[3]/a[1]"))).perform();
		Thread.sleep(4000);
		bo.findElement(By.xpath("//a[contains(text(),'Debit Cards')]")).click();
		


	}

}
