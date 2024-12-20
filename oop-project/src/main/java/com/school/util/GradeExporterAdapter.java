package com.school.util;



public class GradeExporterAdapter {
    private GradeExporter gradeExporter;

    public GradeExporterAdapter(String format) {
        if ("Excel".equalsIgnoreCase(format)) {
            this.gradeExporter = new ExcelGradeExporter();
        } else if ("PDF".equalsIgnoreCase(format)) {
            this.gradeExporter = new PDFGradeExporter();
        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }

    public GradeExporter getGradeExporter() {
        return gradeExporter;
    }
}
