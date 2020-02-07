package pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sikulicls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver bo=new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.manage().window().maximize();
		
		Screen sc=new Screen();
		Pattern ud=new Pattern("C:\\Users\\qaplanet\\Desktop\\ude.PNG");
		Pattern pd=new Pattern("C:\\Users\\qaplanet\\Desktop\\pde.PNG");
		Pattern log=new Pattern("C:\\Users\\qaplanet\\Desktop\\lge.PNG");
		
		sc.type(ud,"qaplanet1");
		Thread.sleep(3000);
		sc.type(pd,"lab1");
        Thread.sleep(3000);
	     sc.click(log);
	   
	

	}

}
