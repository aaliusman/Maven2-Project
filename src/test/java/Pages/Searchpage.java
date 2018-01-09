package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchpage {
	
	public static void Gettxt(WebDriver driver) throws InterruptedException
	{
		//WebElement Gettxt= driver.findElement(By.xpath(".//*[@id='content']"));
		System.out.println("Get text:"+driver.findElement(By.xpath(".//*[@id='content']")).getText());
		//System.out.println(driver.findElement(By.xpath(".//*[@id='content']")).getText());
		Thread.sleep(3400);
	}

}
