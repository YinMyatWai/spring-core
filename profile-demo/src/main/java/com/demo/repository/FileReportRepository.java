package com.demo.repository;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("file")
public class FileReportRepository implements ReportRepository{

    @Override
    public Report save(Report report) {
        System.out.println("FileReportRepository::save() invoked.");
        return report;
    }
}
