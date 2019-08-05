package NewProjectAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewProject {

	@Test
	public static void newProject()
			{
	
		System.setProperty("webdriver.chrome.driver","C:\\JavaSeleniumWD\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		
		//open url
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
	
		//Entering username and password
		dr.findElement(By.xpath("//a[@class='login']")).click();
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("chilluyadav@gmail.com");
		dr.findElement(By.xpath("//input[@id='passwd']")).sendKeys("july2828");
		dr.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		
		//Click the contact us button
		dr.findElement(By.xpath("//div[@id='contact-link']//a[contains(text(),'Contact us')]")).click();
		dr.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
		System.out.println(dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span")).getText());
		
		//select Women and select t-shirts
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"))).build().perform();
		dr.findElement(By.xpath("//li[@class='sfHover']//a[contains(text(),'T-shirts')]")).click();
		System.out.println(dr.getTitle());
		
		//Click the quick view of an item
		act.moveToElement(dr.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"))).build().perform();
		dr.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span")).click();
		
		
		//Select s=new Select(dr.findElement(By.xpath("//*[@id=\\\"group_1\\\"]")));
		//s.selectByValue("M");
		
		
		
		//Add to cart
		//act.moveToElement(dr.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"))).build().perform();
		//dr.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
	}

}
