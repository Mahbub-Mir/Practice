package com.mhmpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.testng.Assert.assertTrue;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class AssertAndVerify {

	public static void main(String[] args) throws IOException {
		
		String userdir = System.getProperty("user.dir");
        System.out.println(
                "The user directory is: " + userdir);
		FileInputStream fis = new FileInputStream(userdir + "\\TestData\\ExtrapolatoryTestCases.xlsx");
		//C:\Users\JHUMA\Desktop\AutomationPractice\WebDriver\com.mhmpractice\TestData\ExtrapolatoryTestCases.xlsx
		//FileInputStream fis = new FileInputStream("C:\\Users\\JHUMA\\Desktop\\AutomationPractice\\WebDriver\\com.mhmpractice\\TestData\\ExtrapolatoryTestCases.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("TestCases");
		String cellValue1 = s.getRow(6).getCell(1).getStringCellValue();
        System.out.println(
                "The cell value 1 is: " + cellValue1);
        
        String expCellValue1 = "Check the size of the envelope";

       
//        if ( cellValue1.equals(expCellValue1)) {
//            System.out.println(
//                    "The cell value matches");
//        }
        
        //	Hard Assertion -- if false, then it will abort the execution
        Assert.assertEquals(cellValue1, expCellValue1);
        
        System.out.println(
                "assertEquals Passed");
        
		String cellValue2 = s.getRow(10).getCell(1).getStringCellValue();
        System.out.println(
                "The cell value 2 is: " + cellValue2);
        
        Assert.assertNotEquals(cellValue2, expCellValue1);
        
        System.out.println(
                "assertNotEquals Passed");
        
		
	}

}
