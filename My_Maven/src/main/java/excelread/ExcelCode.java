package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
		public static FileInputStream f;
		public static XSSFWorkbook w;
		public static XSSFSheet s;
		//to get strings values from excel use readStringData()
		public static String readStringData(int i, int j) throws IOException
		{
			f=new FileInputStream("//Users//shonsisivarghese//Desktop//excelread.xlsx");
			w=new XSSFWorkbook(f);
			s=w.getSheet("Sheet1");
			XSSFRow r=s.getRow(i); // to fetch row values
			XSSFCell c = r.getCell(j); // to fetch coloumn values use predifined method getCell()  
			return c.getStringCellValue();
			}
		public static double readIntegerData(int i, int j) throws IOException
		{
			f=new FileInputStream("//Users//shonsisivarghese//Desktop//excelread.xlsx");
			w=new XSSFWorkbook(f);
			s=w.getSheet("Sheet1");
			XSSFRow r=s.getRow(i);
			XSSFCell c = r.getCell(j); // to fetch coloumn values use predifined method getCell()
			return c.getNumericCellValue();
		}

	}


