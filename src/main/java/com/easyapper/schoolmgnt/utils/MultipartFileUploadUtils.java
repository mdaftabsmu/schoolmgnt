package com.easyapper.schoolmgnt.utils;

import com.easyapper.schoolmgnt.*;
import com.easyapper.schoolmgnt.model.*;
import com.easyapper.schoolmgnt.request.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class MultipartFileUploadUtils {
    public static final String REGEX_RULES = "^01\\d{9}$|^1\\d{9}|^d{0}$";

    public static Set<Student> parseExcelToObject(FileUploadDetail data) {
        Set<Student> students = new HashSet<>();
        try {
            FileInputStream file = new FileInputStream(new File("C:\\data\\1615791768275easy1.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            int rowNumber = 0;
            while (rowIterator.hasNext()){
                Row row = rowIterator.next();
                if(rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cellIterator = row.cellIterator();
                Student st = new Student();
                int cellIndex = 0;
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(cellIndex==0) {
                        st.setSrNo((long) cell.getNumericCellValue());
                    }else if(cellIndex==1){
                       st.setAdmNo((long)cell.getNumericCellValue());
                    }else if(cellIndex==2){
                        st.setRecNo(cell.getStringCellValue());
                    }else if(cellIndex==3){
                        st.setNameOfStudent(cell.getStringCellValue());
                    }else if(cellIndex==4){
                        st.setAdmDate(cell.getDateCellValue());
                    }else if(cellIndex==5){
                        st.setsPackage(cell.getStringCellValue());
                    }else if(cellIndex==6){
                        st.setOffer(cell.getStringCellValue());
                    }else if(cellIndex==7){
                        st.setSubject(cell.getStringCellValue());
                    }else if(cellIndex==8){
                        st.setFeeStatus(cell.getStringCellValue());
                    }else if(cellIndex==9){
                        st.setBalPynt(cell.getNumericCellValue());
                    }else if(cellIndex==10){
                        st.setAadharNo((long)cell.getNumericCellValue());
                    }else if(cellIndex==11){
                        st.setSchoolName(cell.getStringCellValue());
                    }else if(cellIndex==12){
                        st.setSchoolAddress(cell.getStringCellValue());
                    }else if(cellIndex==13){
                        st.setOrganisationName(cell.getStringCellValue());
                    }else if(cellIndex==14){
                        st.setOganisationAddress(cell.getStringCellValue());
                    }else if(cellIndex==15){
                        st.setHyperLink(cell.getStringCellValue());
                    }else if(cellIndex==16){
                        st.setDayTime((long)cell.getNumericCellValue());
                    }else if(cellIndex==17){
                        st.setStartDate(cell.getDateCellValue());
                    }else if(cellIndex==18){
                        st.setDueDate(cell.getDateCellValue());
                    }else if(cellIndex==19){
                        st.setPastRenewals(cell.getStringCellValue());
                    }else if(cellIndex==20){
                        st.setContact1(cell.getStringCellValue());
                    }else if(cellIndex==21){
                        st.setContact2(cell.getStringCellValue());
                    }else if(cellIndex==22){
                        st.setLandline(cell.getStringCellValue());
                    }else if(cellIndex==23){
                        st.setAddress(cell.getStringCellValue());
                    }else if(cellIndex==24){
                        st.setEmailAddress(cell.getStringCellValue());
                    }else if(cellIndex==25){
                        st.setDateofBirth(cell.getDateCellValue());
                    }else if(cellIndex==26){
                        st.setFatherName(cell.getStringCellValue());
                    }else if(cellIndex==27){
                        st.setFatherOccupation(cell.getStringCellValue());
                    }else if(cellIndex==28){
                        st.setSpouseName(cell.getStringCellValue());
                    }else if(cellIndex==29){
                        st.setMotherName(cell.getStringCellValue());
                    }else if(cellIndex==30){
                        st.setMotherOccupation(cell.getStringCellValue());
                    }else if(cellIndex==31){
                        st.setOrganisationName(cell.getStringCellValue());
                    }else if(cellIndex==32){
                        st.setRemark(cell.getStringCellValue());
                    }
                    cellIndex++;
                }
                students.add(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}