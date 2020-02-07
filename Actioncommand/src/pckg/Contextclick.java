package pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions acr=new Actions(bo);
		//right  click on login button
		acr.contextClick(bo.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"))).perform();
		bo.close();

	}

}
