package com.school.util;

import com.school.model.Grade;

import java.util.List;

public class ExcelGradeExporter implements GradeExporter {

    @Override
    public void export(List<Grade> grades) {
        // Logic to export grades to Excel
        System.out.println("Exporting grades to Excel...");
        // Simulate Excel export
        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }
}
