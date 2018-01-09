package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Accessories extends Lib {
	
	public static void Search(WebDriver driver) throws InterruptedException, IOException
	{
		WebElement Search= findelement(driver, ".//*[@id='main-nav']/form/fieldset/input[1]" );
		sleep(driver, 2);
//		WebElement applewatch= driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
//		Thread.sleep(3000);
		//Search.sendKeys("apple watch"+"\n");
		Search.sendKeys(readexcel(driver, 0, 0)+"\n");
		Thread.sleep(2000);
		//Actions ac=new Actions(driver);
		//ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		
	}

}
