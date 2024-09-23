package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = ExcelCode.readStringData(0,0); //sheona
		double d =ExcelCode.readIntegerData(0,1);
		String ss = ExcelCode.readStringData(1,0); //liya
		double dd =ExcelCode.readIntegerData(1,1);
		String sd = ExcelCode.readStringData(2,0); //meenu
		double dc =ExcelCode.readIntegerData(2,1);
		System.out.println(s); //also give like this System.out.println(ExcelCode.readStringData(0,0);
		System.out.println(d);
		System.out.println(ss);
		System.out.println(dd);
		System.out.println(sd);
		System.out.println(dc);	
	}

}
