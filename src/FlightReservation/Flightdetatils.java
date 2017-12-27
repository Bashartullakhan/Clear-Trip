package FlightReservation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Flightdetatils {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("hyd");
		driver.findElement(By.xpath(".//ul[@id='ui-id-1']/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("del");
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ReturnDateContainer']/dd/div/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[4]/a")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='Adults']"));
		Select adult=new Select(ele);
		adult.selectByValue("2");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/section[3]/div[2]/section[2]/section/div/form/section[2]/div[4]/div[1]/div/nav/ul/li[10]/a")).click();
		driver.findElement(By.xpath("html/body/section[3]/div[2]/section[2]/section/div/form/section[2]/div[4]/div[1]/nav/ul/li[24]/div/label/table/tbody/tr[1]/th[1]/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/section[3]/div[2]/section[2]/section/div/form/section[2]/div[4]/div[2]/div/nav/ul/li[10]/a")).click();
		driver.findElement(By.xpath("html/body/section[3]/div[2]/section[2]/section/div/form/section[2]/div[4]/div[2]/nav/ul/li[2]/div/label/table/tbody/tr[1]/th[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/section[3]/div[2]/section[2]/section/div/form/section[2]/div[3]/div[3]/button")).click();
		

	}

}
