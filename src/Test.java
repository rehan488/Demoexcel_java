import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	static ArrayList<String> usrname=new ArrayList<String>();
	static ArrayList<String> password=new ArrayList<String>();
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			InputStream ExcelFileToRead = new FileInputStream("/home/gangadhar/Documents/rehan/abc.xlsx");
			XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);	
			XSSFSheet sheet = wb.getSheetAt(0);
			int size = sheet.getLastRowNum();
			for(int i=1;i<=size;i++)
			{
				String usr=wb.getSheetAt(0).getRow(i).getCell(2).toString();
				usrname.add(usr);
				String pwd=wb.getSheetAt(0).getRow(i).getCell(3).toString();
				password.add(pwd.replaceFirst(".0",""));
			}
			System.out.println("Test");
			System.out.println(usrname+ "	"+password);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
