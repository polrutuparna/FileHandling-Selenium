/*
 Select Countries Start with Latter 'C'
 
  */


package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class execrcise1 {

 public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver", "C:\\Rutu\\Selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

  driver.get("https://cosmocode.io/automation-practice-webtable/");
  
  List<WebElement> ch=driver.findElements(By.xpath("//input[@type='checkbox']"));

  List<WebElement> wb = driver.findElements(By.xpath("//div[@class='entry-content']//tr/td/strong"));
  
          for(int i=0;i<wb.size();i++) {
           
           if(wb.get(i).getText().startsWith("C")) {
            ch.get(i).click();  
   }

  }
driver.close();
 }

}