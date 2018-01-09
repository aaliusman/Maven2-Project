package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class HOme extends Lib{
	
	public static void myaccount(WebDriver driver) throws InterruptedException, IOException
	{
		//WebElement mact=driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input"));
		
		WebElement mact= findelement(driver, readprop(driver, "myact"));
		System.out.println("here is the text::"+mact.getText());
		
	}
	public static void clickproca(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.xpath(readprop(driver, "procat"))).click();
		
	}
	public static void PrintTitle(WebDriver driver) throws InterruptedException
	{
		System.out.println("Title of homepage"+driver.getTitle());
		
		
	}
	
	 public static void clickAllpro(WebDriver driver) throws InterruptedException
	{
		WebElement clickallpro= driver.findElement(By.xpath("//h1[@class='entry-title']"));
		clickallpro.click();
		
	}

	}


