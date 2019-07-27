package ReadDataFromHTMLTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ReadDataHTML {
	
	@Test
	public void ReadDataFromHTML()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\JavaSeleniumWD\\driver\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	
	dr.get("https://www.livechennai.com/gold_silverrate.asp");
	System.out.println(dr.getTitle());
	//get cell values from HTML/Web table
	System.out.println(dr.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[3]/td[4]/font")).getText());
	//Row count 
	//List<WebElement> t = dr.findElements(By.xpath("/html/body/div[2]/abdiv[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[4]"));
	List<WebElement> trCount=dr.findElements(By.tagName("tr"));
	List<WebElement> trData=dr.findElements(By.tagName("td"));
	
	System.out.println(trCount.size());
	System.out.println(trData.size());
	//Cell count
	
	}
	

}
