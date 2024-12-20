package com.school.service;

import com.school.model.Grade;
import com.school.util.*;

import java.util.ArrayList;
import java.util.List;

public class GradeService {
    private List<Grade> grades;

    private static GradeService instance;

    private GradeService() {
        this.grades = new ArrayList<>();
    }

    public static synchronized GradeService getInstance() {
        if (instance == null) {
            instance = new GradeService();
        }
        return instance;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public List<Grade> getGradesByModuleElement(String moduleElementCode) {
        List<Grade> result = new ArrayList<>();
        for (Grade grade : grades) {
            if (grade.getModuleElement().getCode().equals(moduleElementCode)) {
                result.add(grade);
            }
        }
        return result;
    }

    public void enterGrade(Grade grade) {
        addGrade(grade);
    }

    public void updateGrade(Grade grade) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getStudentId().equals(grade.getStudentId()) &&
                    grades.get(i).getModuleElement().getCode().equals(grade.getModuleElement().getCode())) {
                grades.set(i, grade);
            }
        }
    }

    public void validateGrades(String moduleElementCode, String professorId) {
        for (Grade grade : getGradesByModuleElement(moduleElementCode)) {
            if (grade.getProfessorId().equals(professorId)) {
                grade.setStatus("validated");
            }
        }
    }

    public void exportGrades(String moduleElementCode, GradeExporter gradeExporter) {
        List<Grade> grades = getGradesByModuleElement(moduleElementCode);
        gradeExporter.export(grades);
    }
}
