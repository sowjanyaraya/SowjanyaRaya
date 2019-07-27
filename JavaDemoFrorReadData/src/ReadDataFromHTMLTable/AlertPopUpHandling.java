package ReadDataFromHTMLTable;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpHandling {

	@Test
	public void AlertPopUp()
	{
	System.setProperty("webdriver.chrome.driver","C:\\JavaSeleniumWD\\driver\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	
	dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
	dr.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	Alert alt=dr.switchTo().alert();
	alt.accept();
	dr.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("welcome");
	
	
}
}
