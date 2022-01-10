package mavenProject2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NorthBay {
	WebDriver driver = null;
	@BeforeMethod
	public void BeforMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imran\\Downloads\\96 zip new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.northbaycadillac.com/");

	}
	@Test(dataProvider="datas")
	public void signinTest(String email,String password) throws InterruptedException{
		WebElement signin = driver.findElement(By.xpath("//*[text()='Sign In']"));
		signin.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		System.out.println(email+"-------"+password);
	}

	@DataProvider(name="datas")
	public Object [][] display(){
		Object [][] obj = new String [5][2];

		obj[0][0]="imrantania2012@gmail.com";
		obj[0][1]="sikder1978";
		obj[1][0]="mahesh@gmail.com";
		obj[1][1]="mahesh1987";
		obj[2][0]="refat@gmail.com";
		obj[2][1]="refat1988";
		obj[3][0]="tuhin@gmail.com";
		obj[3][1]="tuhin1980";
		obj[4][0]="seraj@gmail.com";
		obj[4][1]="seraj1990";

		return obj;
	}	
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}




}
