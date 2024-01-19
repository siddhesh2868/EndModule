package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndModule {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div"));
		Thread.sleep(10000);
		driver.findElement(By.name("firstname")).sendKeys("Siddhesh");
		driver.findElement(By.name("lastname")).sendKeys("Kasbekar");
		driver.findElement(By.name("reg_email__")).sendKeys("kasbekarsiddhesh68@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kasbekarsiddhesh68@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pinak@123");
		WebElement date=driver.findElement(By.id("day"));
		Select dropdate=new Select(date);
		dropdate.selectByValue("1");
		
		WebElement month=driver.findElement(By.id("month"));
		Select dropmonth=new Select(month);
		dropmonth.selectByIndex(3);
		
		WebElement year=driver.findElement(By.id("year"));
		Select dropyear=new Select(year);
		dropyear.selectByValue("1997");
		
		driver.findElement(By.id("u_3_5_O8")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(10000);
	}
}
