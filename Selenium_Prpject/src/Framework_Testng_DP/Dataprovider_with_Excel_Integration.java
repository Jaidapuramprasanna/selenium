package Framework_Testng_DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.Data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;

public class Dataprovider_with_Excel_Integration
{
	FileInputStream fi;
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	String filepath="E:\\vihaan\\TestData\\";
	
	
  @Test(dataProvider = "userdata")
  public void f(String operator, String mobile) {
  }
  

  @DataProvider
  public String[][] userdata()
  {
	  int LRnum=sht.getLastRowNum();
	  System.out.println("=>"+LRnum);
	  String data[][];
	  data=new String[LRnum+1][2];
	  
	  for (int i = 0; i < LRnum; i++) 
	  {
		  // Iterate num of cells
		  for (int j = 0; j <=1; j++) 
		  {
			  data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			
		}
		
	}
	  
	return data;
	  
  }
  @BeforeClass
  public void setUpBeforeClass() throws Exception 
  {
	  fi=new FileInputStream(filepath+"InputData.xlsx");
	  System.out.println("file located");
	  book=new XSSFWorkbook(fi);
	  sht=book.getSheet("sheet1");
	  
  }

  @AfterClass
  public void tearDownAfterClass() throws Exception
  {
	  book.close();
  }

}
