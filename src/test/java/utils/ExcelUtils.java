package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

    public static String getCellData(
            String filePath,
            int rowNum,
            int colNum) {

        try {

            FileInputStream fis =
                    new FileInputStream(filePath);

            Workbook workbook =
                    WorkbookFactory.create(fis);

            Sheet sheet =
                    workbook.getSheetAt(0);

            DataFormatter formatter =
                    new DataFormatter();

            String data =
                    formatter.formatCellValue(
                    sheet.getRow(rowNum)
                         .getCell(colNum));

            workbook.close();

            return data;

        } catch (Exception e) {

            e.printStackTrace();

            return "";
        }
    }
}