package readExcelUsingPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelFileExample {

	private static final String path = "C://Users//kebhardwaj//Desktop//student.xls";

	public static void main(String args[]){
		List studentList = getStudentListFromExcel();
	}

	public static List getStudentListFromExcel(){

		List studentList = new ArrayList();
		FileInputStream fis = null;

		try{
			fis = new FileInputStream(path);
			Workbook workbook = new HSSFWorkbook(fis);

			int numberOfSheets = workbook.getNumberOfSheets();
			for(int i = 0 ;i <numberOfSheets ; i++){
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterate = sheet.iterator();
				while(rowIterate.hasNext()){
					Student student = new Student();
					Row row = (Row) rowIterate.next();
					Iterator cellIterator = row.cellIterator();
					while(cellIterator.hasNext()){
						Cell cell = (Cell) cellIterator.next();
						if(cell.CELL_TYPE_STRING == cell.getCellType()){
							student.setName(cell.getStringCellValue());
						}
						else if(cell.CELL_TYPE_NUMERIC == cell.getCellType()){
							if(cell.getColumnIndex() == 1){
								student.setMaths(String.valueOf(cell.getNumericCellValue()));
							}
							else if(cell.getColumnIndex() == 2){
								student.setMaths(String.valueOf(cell.getNumericCellValue()));
							}
							else if(cell.getColumnIndex() == 3){
								student.setMaths(String.valueOf(cell.getNumericCellValue()));
							}
						}

					}
					studentList.add(student);
				}
				fis.close();


			}}
		catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
		catch(IOException IO){
			IO.printStackTrace();
		}
		return studentList;
	}
}
