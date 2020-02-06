package brows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAP28\\Desktop\\pspk\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
		
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("nayak1431");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nayaknaresh143");
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		
		//driver.findElement(By.xpath("//body[@class='logged-in env-production min-width-lg']")).click();
		driver.close();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("url");
		
		
		
		//System.out.println("running with chrome");
	

	}

}
