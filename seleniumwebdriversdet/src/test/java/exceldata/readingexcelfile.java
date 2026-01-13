package exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexcelfile {

	public static void main(String[] args) throws IOException {
		//reading=>FileinputStream
		//Writing=>fileoutputstream
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\exceldata\\Project-Management-Sample-Data.xlsx");
        try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
			XSSFSheet sheet =workbook.getSheet("Project Management Data");
			 int total_rows=sheet.getLastRowNum();
			 int total_cell=sheet.getRow(1).getLastCellNum();
			 System.out.println(total_rows);
			 System.out.println(total_cell);
			
			 for(int i=5;i<=total_rows;i++) {
				XSSFRow cr= sheet.getRow(i);
				 for(int j=1;j<total_cell;j++) {
					 XSSFCell cs=cr.getCell(j);
					 System.out.println(cs.toString());
				 }
			 }
		}
	}

}
