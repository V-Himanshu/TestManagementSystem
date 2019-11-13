package com.testapp.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.testapp.model.Questions;

public class ReadExcel {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\harihara.k\\Desktop\\QuestionBank.xlsx";
		int count = 0;
		List<Questions> questionsList = new ArrayList<Questions>();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(fis);
			int numberOfSheets = workbook.getNumberOfSheets();
			System.out.println(numberOfSheets);
			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator<?> rowIterator = sheet.iterator();
				while (rowIterator.hasNext()) {

					Questions questions = new Questions();
					Row row = (Row) rowIterator.next();
					Iterator<?> cellIterator = row.cellIterator();
					while (cellIterator.hasNext()) {
						count += 1;
						Cell cell = (Cell) cellIterator.next();

						String value = null;
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							value = String.valueOf(cell.getNumericCellValue()).replaceFirst("\\.0+$", "");
//							value = "" + cell.getNumericCellValue();
							break;
						case Cell.CELL_TYPE_STRING:
							value = cell.getStringCellValue();
							break;
						}

						// if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
						if (cell.getColumnIndex() == 0) {
							questions.setQuestionId(value);
						}
						if (cell.getColumnIndex() == 1) {
							questions.setTopic(value);
						}
						if (cell.getColumnIndex() == 2) {
							questions.setQuestionDescription(value);
						}
						if (cell.getColumnIndex() == 3) {
							questions.setOption1(value);
						}
						if (cell.getColumnIndex() == 4) {
							questions.setOption2(value);
						}
						if (cell.getColumnIndex() == 5) {
							questions.setOption3(value);
						}
						if (cell.getColumnIndex() == 6) {
							questions.setOption4(value);
						}
						if (cell.getColumnIndex() == 7) {
							questions.setOption5(value);
						}
						if (cell.getColumnIndex() == 8) {
							questions.setAnswer(value);
						}
						if (cell.getColumnIndex() == 9) {
							questions.setOptionType(value);
						}

						// }
					}
					questionsList.add(questions);
				}
			}
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
		System.out.println(questionsList.get(1));
//		insertDao.insertQuestionsFromExcelToDb(questionsList);
	}

}
