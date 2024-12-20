package com.school.repository;

import com.school.model.Grade;

import java.util.List;

public interface GradeRepository {
    void addGrade(Grade grade);

    List<Grade> getGradesByModuleElement(String moduleElementCode);

    List<Grade> getGradesByModuleElementAndProfessor(String moduleElementCode, String professorId);

    void updateGrade(Grade grade);

    void deleteGrade(String studentId, String moduleElementCode);

    Grade findGradeByStudentAndModuleElement(String studentId, String moduleElementCode);
}
