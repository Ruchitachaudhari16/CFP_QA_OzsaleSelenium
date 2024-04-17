package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo
{
   public WebDriver driver;
  @Test
  public void getSignup() throws InterruptedException, IOException
   {
      driver=new ChromeDriver();
      driver.get("https://www.ozsale.com.au/");
      driver.manage().window().maximize();
      driver.findElement(By.linkText("My Account")).click();

      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ruchita");
      driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Chaudhari");
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cruchita926@gmail.com");
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ruchita@1611");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
   }
@Test
    public void getSignin() throws InterruptedException {

    driver=new ChromeDriver();
    driver.get("https://www.ozsale.com.au/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("My Account")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='ytTyd test-login-form-tabs-item AQAHH']")).click();
  // driver.findElement(By.linkText("login")).click();
}
}
