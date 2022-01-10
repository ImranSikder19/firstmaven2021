package mavenProject2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOn {
WebDriver driver = null;	
@BeforeMethod	
public void sum() throws InterruptedException {	
System.setProperty("webdriver.chrome.driver","C:\\Users\\imran\\Downloads\\96 zip new//chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.google.com");
  
}
 @Test(invocationCount=3)
public void d()  {
	driver.findElement(By.name("q")).sendKeys("USA");
	
}
@Test(dependsOnMethods="d",description= "click on signin link")
public void A()  {
	driver.findElement(By.xpath("//a[@class='gb_3 gb_4 gb_3d gb_3c']")).click();
	
}

@Test(dependsOnMethods = "A")
public void B() throws InterruptedException  {
	driver.findElement(By.xpath("//a[@class='gb_3 gb_4 gb_3d gb_3c']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='TquXA']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@data-value='bn'])[2]")).click();

}
	
	@Test(dependsOnMethods = "B")
	public void C() throws InterruptedException  {
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[text()='Maps']")).click();
	}
	
	@AfterMethod
public void dismiss() {
	driver.quit();
	
}

}
