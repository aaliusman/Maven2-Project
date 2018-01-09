package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Ipad {
	
	public static void ClickApple(WebDriver driver) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='MacBooks']")).click();
		Thread.sleep(3000);
				
	}

}
