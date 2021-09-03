package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	// hena ana bs h3ml intiate ll fis
	static FileInputStream fis= null;
	//elfunction de 3lshan asawy el fis da b elpath bt3 elexcel sheet 3nde


	public FileInputStream getFileInputStream(){
		//String filePath=System.getProperty(("user.dir")+"\\src\\test\\java\\data\\userData.xlsx");
		String filePath=System.getProperty("user.dir")+"/src/test/java/data/userData.xlsx";
		//String filePath=System.getProperty(("user.dir")+"src/test/java/data/userData.xlsx");
		File srcFile=new File(filePath);
		try {
			fis=new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found.terminating process!! :Check file path of test data file");
		}

		return fis;
	}

	public Object[][] getExcelData() throws IOException{

		fis=getFileInputStream();
		//hena b3rfo en el fis mb2ash b null da b2a bysawy ely tl3 mn elfunction ely fatet ely hoa el path bt3 elexcel sheet
		//h3ml add l dependency gdeda esmha POI fi elpom

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//hena workbook y3ne elexcel kolo

		XSSFSheet sheet= wb.getSheetAt(0);
		//da elsaf7a ely w2fa 3leha (sheet1) fi elexcel .. momkn bdl b elindex a3mlha b sheet1 ely byb2a mktob t7t fi elexcel bs 3lshan momkn yt8yr fa b elindex a7sn

		int totalNumberOfRows=(sheet.getLastRowNum()+1);
		int totalNumberOfColumns=8;
		//ana b3d elcolumns bnfsy w a7tohom ,, lakn fi elrows b2olo hatly a5r row +1 3lshan admn en gab l a5er data mwgoda


		//b3ml array of 2 dimension columns and rows w eltqa2hom hya elcell ely feha eldata
		String[][] excelSheetArray=new String[totalNumberOfRows][totalNumberOfColumns];

		for (int i = 0; i < totalNumberOfRows; i++) {
			for (int j = 0; j < totalNumberOfColumns; j++) {
				XSSFRow row = sheet.getRow(i);         //hena by2ole hoa w2f 3nd ay row (0,1,2...)
				row.getCell(j).setCellType(CellType.STRING); //de 3lshan kan by2ra elnumbers mn elexcel sheet b fraction 15.0 fa h7wlo l text abl ma a3mlo save fi elarray ely hn3mlo return
				excelSheetArray[i][j]=row.getCell(j).toString();   //bgeb elcell nfsha
				
				
				
			}}
		wb.close();  //b2flo 3lshan ana ft7a stream
		return excelSheetArray;   //b3ml return ll array da

	}





}
