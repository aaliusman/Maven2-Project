package Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Accessories;
import Pages.AllProduct;
import Pages.HOme;
import Pages.Ipad;
import Pages.MacBook;
import Pages.Productca;
import Pages.Searchpage;




public class Test {
	
	static WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Maven2\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
	}

	@After
	public void after() {
		driver.manage().deleteAllCookies();
		driver.close();

}
	@org.junit.Test	
	public void Testing() throws InterruptedException, IOException {
		System.out.println("test");
		HOme hm=new HOme();
		hm.myaccount(driver);
		hm.clickproca(driver);
		hm.PrintTitle(driver);
		hm.clickAllpro(driver);
		
		Productca pca= new Productca();
		pca.printtitle(driver);
		pca.Printtxt(driver);
		pca.clickipads(driver);
		
		AllProduct ap=new AllProduct();
		ap.printTitle3(driver);
		
		
		Ipad apple = new Ipad();
		apple.ClickApple(driver);
		
		MacBook mc=new MacBook();
		mc.ClickApple(driver);
		
		Accessories se= new Accessories();
		se.Search(driver);
		
		Searchpage sp=new Searchpage();
		sp.Gettxt(driver);
				
		
	}
}
