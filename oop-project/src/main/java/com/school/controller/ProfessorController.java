package com.school.controller;



import com.school.model.Grade;
import com.school.service.GradeService;
import com.school.service.ModuleElementService;
import com.school.util.GradeExporter;
import com.school.util.GradeExporterAdapter;

public class ProfessorController {
    private final GradeService gradeService;
    private final ModuleElementService moduleElementService;

    public ProfessorController(GradeService gradeService, ModuleElementService moduleElementService) {
        this.gradeService = gradeService;
        this.moduleElementService = moduleElementService;
    }

    public void enterGrade(Grade grade) {
        gradeService.enterGrade(grade);
    }

    public void updateGrade(Grade grade) {
        gradeService.updateGrade(grade);
    }

    public void validateGrades(String moduleElementCode, String professorId) {
        gradeService.validateGrades(moduleElementCode, professorId);
    }

    public void exportGrades(String moduleElementCode, String format) {
        GradeExporterAdapter adapter = new GradeExporterAdapter(format);
        GradeExporter gradeExporter = adapter.getGradeExporter();
        gradeService.exportGrades(moduleElementCode, gradeExporter);
    }
}
