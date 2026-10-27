package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class ReadData {

    // Here im declaring the path in my computer where the file is located
    static String testDataPath = System.getProperty("user.dir")+ "/src/test/java/testData/TestData.xlsx";


    //This is like a medium where the file were the raw file we go through
    static FileInputStream fileInputStream;

    //And now we are going to load the file in this InputStream, but in conjunction with try and catch just in case or path is empty
     static {
         try{
             fileInputStream = new FileInputStream(testDataPath);
         }
         catch (Exception ex){
                throw new RuntimeException(ex);
         }
    }

    // Now we're declaring a Workbook - This is what Selenium understands (as Excel file ) and interacts with
    static XSSFWorkbook workbook;

     // And now we're uploading that fileInputStream that already holds the raw file to our workbook so Selenium can understand
     static {
         try{
             workbook = new XSSFWorkbook(fileInputStream);
         }
         catch (Exception ex){
             throw new RuntimeException(ex);
         }
     }

     // This is the constructor to read data
     public ReadData() throws Exception{

     }

     // Here Selenium interacts with the workbook to get the  Excel Sheet we want to extract data from
     static XSSFSheet sheet = workbook.getSheet("Sheet1");

     // Then we extract the exact row and column where we want the data using indexes and return type as String
     public static String username = sheet.getRow(0).getCell(1).getStringCellValue();
     public static String password = sheet.getRow(1).getCell(1).getStringCellValue();


//     @Test
//    public void testData(){
//         System.out.println("Username: "+ username);
//         System.out.println("Password: "+ password);
//     }
}
