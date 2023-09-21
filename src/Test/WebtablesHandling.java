package Test;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesHandling {
 public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver", "C:\\Rutu\\Selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");

  List<WebElement> a = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[4]"));

  int sum = 0;
  for (WebElement k : a) {

   String s = k.getText();
   // Converting String into int using Integer.parseInt()
   int i = Integer.parseInt(s);

   sum = sum + i;
  /* sum=0+28;=28
   sum= 28+23= 51
   sum= 51+48*/
 
  }

  System.out.println(sum);
  
  
  WebElement b=driver.findElement(By.xpath("//div[@class='totalAmount']"));
  System.out.println(b.getText());
  
  
  String d=b.getText();
  
  String [] words=d.split(" ");
  
   System.out.println(Arrays.toString(words));
  
  String expectedAmount=words[3];
  
  System.out.println(expectedAmount);
  
  int expectedAmou=Integer.parseInt(expectedAmount);
  
  if(sum== expectedAmou) {
   
   System.out.println("addition is matching");
  }
 
 /*
  Webtable handling :: Sum verified using below condition - 
if(d[i].matches("\\d+")) {
        result = Integer.parseInt(d[i]);
      }
   */

 }

}