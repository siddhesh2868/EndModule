package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shubham {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/u/0/&dsh=S789478083:1705635728365532&emr=1&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https://mail.google.com/mail/u/0/&ifkv=ASKXGp3Iy4rZ8aY-Ir-StrhbymUYSfNTZgm3--0vZXRXM1wGCp1gNsq4qDSMbrYIXj5T8jqdr4chCw&osid=1&service=mail&theme=glif&TL=AHNYTISyf6sqNawSxVgKJo4VFW1rhDamKAWM4EGWSLqivXZxBIsTXXwaiTRiV1Qw");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Shubham");
		driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
		WebElement month=driver.findElement(By.id("month"));
		Select dropmonth=new Select(month);
		dropmonth.deselectByIndex(4);
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1999");
		WebElement gender=driver.findElement(By.id("gender"));
		Select dropgender=new Select(month);
		dropgender.deselectByIndex(2);
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("shubhkutwad2309431");
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Info.way@2309");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Info.way@2309");
		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		driver.quit();
	}
}
