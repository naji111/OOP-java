package com.school.util;

import com.school.model.Grade;

import java.util.List;

public class PDFGradeExporter implements GradeExporter {

    @Override
    public void export(List<Grade> grades) {
        // Logic to export grades to PDF
        System.out.println("Exporting grades to PDF...");
        // Simulate PDF export
        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }
}
