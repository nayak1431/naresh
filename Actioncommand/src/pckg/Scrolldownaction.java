package pckg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolldownaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.hdfcbank.com/");
		Actions acr=new Actions(bo);
		Thread.sleep(6000);
		acr.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(3000);
		 acr.sendKeys(Keys.PAGE_UP).build().perform();
		 bo.close();

	}

}
