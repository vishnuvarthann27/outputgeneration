package com.project.outputgeneration.service;

import com.project.outputgeneration.entity.Llr;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelService {

    public byte[] generateExcel(List<Llr> llrs) throws IOException {
        try (Workbook workbook = new XSSFWorkbook();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            Sheet sheet = workbook.createSheet("LLR");
            Row headerRow = sheet.createRow(0);
            String[] columns = {"Investor Loan Number", "Servicer Loan Number", "Prin Payment Amount", "Int Payment Amount",
                    "Tran Date", "Next pymt Due Date", "Curtailment Amount", "Int Only Payment", "Liquidation Payment", "End UPB", "Opening UPB",
                    "Original UPB", "DDLPI Date", "First Payment Date", "Loan Maturity Date", "Investor Code", "Issuer Number"};

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
            }

            CreationHelper creationHelper = workbook.getCreationHelper();
            CellStyle dateCellStyle = workbook.createCellStyle();
            dateCellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd"));

            int rowNum = 1;
            for (Llr transaction : llrs) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(transaction.getInvstrLoanNbr());
                row.createCell(1).setCellValue(transaction.getSrvcrLoanNbr());
                row.createCell(2).setCellValue(transaction.getPrinPymtAmt());
                row.createCell(3).setCellValue(transaction.getIntPymtAmt());

                Cell txnDtCell = row.createCell(4);
                txnDtCell.setCellValue(transaction.getTxnDt());
                txnDtCell.setCellStyle(dateCellStyle);

                Cell nextPymtDueDtCell = row.createCell(5);
                nextPymtDueDtCell.setCellValue(transaction.getNextPymtDueDt());
                nextPymtDueDtCell.setCellStyle(dateCellStyle);

                row.createCell(6).setCellValue(transaction.getCrtlAmt());
                row.createCell(7).setCellValue(transaction.getIntOnlyPymtAmt());
                row.createCell(8).setCellValue(transaction.getLqdtnPymtAmt());
                row.createCell(9).setCellValue(transaction.getEndUpbAmt());
                row.createCell(10).setCellValue(transaction.getOpeningUpbAmt());
                row.createCell(11).setCellValue(transaction.getOriginalPrinBal());

                Cell ddlpiDtCell = row.createCell(12);
                ddlpiDtCell.setCellValue(transaction.getDdlpiDt());
                ddlpiDtCell.setCellStyle(dateCellStyle);

                Cell firstPaymentDateCell = row.createCell(13);
                firstPaymentDateCell.setCellValue(transaction.getFirstPaymentDate());
                firstPaymentDateCell.setCellStyle(dateCellStyle);

                Cell loanMtrDtCell = row.createCell(14);
                loanMtrDtCell.setCellValue(transaction.getLoanMtrDt());
                loanMtrDtCell.setCellStyle(dateCellStyle);

                row.createCell(15).setCellValue(transaction.getInvstrCd());
                row.createCell(16).setCellValue(transaction.getIssurNbr());
            }

            workbook.write(outputStream);
            return outputStream.toByteArray();
        }
    }
}

