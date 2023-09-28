package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetching_Data_From_Excel_File {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	String title=driver.getTitle();
	System.out.println(title);
	wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
	FileOutputStream fo=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\TestData.xlsx.xlsx");
	wb.write(fo);
		driver.close();

}
}
