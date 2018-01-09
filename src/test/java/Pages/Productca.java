package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Productca extends Lib {

	public static void printtitle(WebDriver driver)
	{
		System.out.println("title of the page"+driver.getTitle());
	}
	
	public static void Printtxt(WebDriver driver) throws InterruptedException, IOException
	{
		WebElement tx= driver.findElement(By.xpath(readprop(driver, "gettxt")));
		System.out.println("text on product"+tx.getText());
		
	} 
	
	public static void clickipads(WebDriver driver) throws InterruptedException
	{	Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='iPads']")).click();
		
		
		
	}

}
