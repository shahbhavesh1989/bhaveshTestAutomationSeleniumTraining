package com.selenium.training.topics;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class T07_dataReadFromExcel {

    public static void main(String[] args) throws IOException {
        File src = new File("C:\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("Sheet1");
        for (int i = 0; i <= sh.getLastRowNum(); i++) {
            System.out.print(sh.getRow(i).getCell(0).getStringCellValue());
            System.out.print("\t");
            System.out.print(sh.getRow(i).getCell(1).getStringCellValue());
            System.out.println();
        }
        wb.close();
    }
}