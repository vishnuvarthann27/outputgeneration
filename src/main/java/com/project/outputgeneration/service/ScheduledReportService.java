package com.project.outputgeneration.service;

import com.project.outputgeneration.entity.Llr;
import com.project.outputgeneration.repository.LLRRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ScheduledReportService {

    private final LLRRepository llrRepository;
    private final ExcelService excelService;
    private final EmailService emailService;
    private final S3Service s3Service;

    public ScheduledReportService(LLRRepository transactionRepository,
                                  ExcelService excelService,
                                  EmailService emailService,
                                  S3Service s3Service) {
        this.llrRepository = transactionRepository;
        this.excelService = excelService;
        this.emailService = emailService;
        this.s3Service = s3Service;
    }

    public void fetchDataAndProcess() throws Exception {
        LocalDateTime oneHourAgo = LocalDateTime.now().minusHours(1);

        Date currentDate = new Date();
        Instant instant = currentDate.toInstant().minus(1, ChronoUnit.HOURS);
        Date updatedDate = Date.from(instant);

        List<Llr> transactions = llrRepository.findLastHourTransactions(oneHourAgo);

        byte[] excelFile = excelService.generateExcel(transactions);

        // Send email
        emailService.sendEmail("vishnuvarthan27011999@gmail.com", excelFile);

        // Upload to S3
        s3Service.uploadFile(excelFile, "transactions-" + System.currentTimeMillis() + ".xlsx");
    }

    @Scheduled(cron = "0 0 * * * ?")
    public void generateAndSendReport() throws Exception {
        System.out.println("Scheduled Job Started...");
        fetchDataAndProcess();
        System.out.println("Scheduled Job Completed!");
    }
}
