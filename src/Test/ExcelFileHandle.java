package Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ExcelFileHandle {

	 public static void main(String[] args) throws IOException {

	  //This is class , which will help us to read the excel data
		 FileInputStream fs = new FileInputStream("C:\\Rutu\\Selenium\\testUP.xlsx");


	  //To access the excel file
	  XSSFWorkbook workbook = new XSSFWorkbook(fs);

	  //To access the sheet
	  XSSFSheet sheet = workbook.getSheetAt(0);


	  //To acces to row
	  Row row = sheet.getRow(1);

	   //To access the cell
	  Cell cell = row.getCell(0);

	  System.out.println(cell);

	  String username = cell.toString();
	  /*-----------*/  
	  Row row1 = sheet.getRow(1);
	  
	  Cell cell1 = row.getCell(1);
	  /*-----------*/
	  System.out.println(cell1);

	 String password = cell1.toString();





	  System.setProperty("webdriver.chrome.driver", "C:\\Rutu\\Selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();

	   driver.get("https://login.salesforce.com/?locale=in");

	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	   driver.findElement(By.xpath("//input[@id='Login']")).click();


fs.close();
driver.close();
	 }

	}
	