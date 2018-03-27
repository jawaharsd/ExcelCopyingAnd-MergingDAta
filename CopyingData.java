package excelProjectTestbed;
import java.io.*;




import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;





public class CopyingData {

	

	 public static void main(String[] args) throws IOException, InvalidFormatException {
		
		   

         FileInputStream file= new FileInputStream(new File("F:\\semister 2\\App development\\studyhall\\week 11\\SDFacultyEffortLogger\\Authorized Data for Project-3\\Amandeep_SD Faculty Effort Log v2.xlsx"));
         XSSFWorkbook inputWorkbook=new XSSFWorkbook(file);

         XSSFSheet worksheet = inputWorkbook.getSheetAt(0); 

         XSSFCell cell = null; 

         cell = worksheet.getRow(10).getCell(8);  

         cell.setCellValue("Jawahar");  

         file.close(); 

          
         FileOutputStream output_file =new FileOutputStream(new File("F:\\semister 2\\App development\\studyhall\\week 11\\SDFacultyEffortLogger\\CopyingData.xlsx"));  //Open FileOutputStream to write updates

           
         inputWorkbook.write(output_file); 

         inputWorkbook.close();

         output_file.close();      

 }

}
