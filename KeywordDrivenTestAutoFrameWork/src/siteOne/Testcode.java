package siteOne;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testcode {



    public void ReadExcel () throws FileNotFoundException {
        String ExcelPath = "/home/deeps/Downloads/Keywords.xlsx";
        FileInputStream fs = new FileInputStream(ExcelPath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sh = wb.getSheet("Sheet1");
        String CellGetContent = sh.getCell(0,0).getContents();

        //OR

        Cell Row0Col0 = Sheet.getCell(0,0);
        Cell Row1Col1 = Sheet.getCell(1,1);
    }
}
