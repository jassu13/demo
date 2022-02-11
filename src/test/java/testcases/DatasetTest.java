package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.ExcelDemo;
import pages.HomePage;

public class DatasetTest extends BaseClass {
	
@Test(dataProvider = "logindata")
public void verifylogin(String username, String password) throws InterruptedException {

	HomePage hp = new HomePage(driver);
	hp.doClickMyAccount();
	hp.doClickLogin();
	ExcelDemo dp = new ExcelDemo(driver);
	dp.doLogin(username, password);
	Thread.sleep(3000);

}

@DataProvider(name="logindata")
public Object[][] passdata() throws IOException{
	File src = new File("C:\\Workspace\\FinalDemo\\src\\test\\excel\\testdata.xlsx");
	//load the file
	FileInputStream fis=new FileInputStream(src);
	//load the workbook from the above excel file 
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	//load the sheet from above excel workbook
	XSSFSheet sheet=wb.getSheetAt(0);
int rowCount= sheet.getLastRowNum();
System.out.println(rowCount);
int rows=rowCount+1;
System.out.println(rows);
	int ColCount =sheet.getRow(0).getLastCellNum();
	System.out.println(ColCount);

	Object [][]excelData = new Object[rowCount][ColCount];

	 

for(int i=1;i<rowCount+1;i++)

{

for(int j=0;j<ColCount;j++)

{

	excelData[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();  

	}

}

	return excelData;
	

}}



	