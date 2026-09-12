package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtil {


    public static String getCellData(
            String filePath,
            String sheetName,
            int rowNumber,
            int columnNumber
    ) throws Exception {

        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
            String data = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();

            workbook.close();
            file.close();

            return data;
        } catch (IOException e) {
            throw new RuntimeException("Unable to read excel file: " + filePath, e);
        }

    }


    public static void writeCellData(
            String filepath,
            String sheetName,
            int rowNumber,
            int columnNumber,
            String value
    ) throws Exception {

        try {
            FileInputStream file = new FileInputStream(filepath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException("Excel sheet not found: " + sheetName);
            }

            Row row = sheet.getRow(rowNumber);

            // create a row when it doesn't exist
            if (row == null) {
                row = sheet.createRow(rowNumber);
            }

            Cell cell = row.getCell(columnNumber);

            // create a cell when it doesn't exist
            if (cell == null) {
                cell = row.createCell(columnNumber);
            }

            cell.setCellValue(value);

            // save updated workbook
            try(FileOutputStream outputStream = new FileOutputStream(filepath)) {
                workbook.write(outputStream);
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to write to Excel file: " + filepath, e);
        }

    }


}
