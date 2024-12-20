package com.school;

import com.school.model.Module;
import com.school.util.*;
import com.school.model.*;
import com.school.util.PasswordUtils;
import com.school.controller.ProfessorController;
import com.school.service.GradeService;
import com.school.service.ModuleElementService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a new user (Admin)
        User admin = new User("admin", PasswordUtils.hashPassword("admin123"), "admin");
        System.out.println("Admin created: " + admin);

        // Create a Professor
        Professor professor = new Professor("John", "Doe", "Mathematics", "P123");
        System.out.println("Professor created: " + professor);

        // Create a Module
        Module module = new Module("MATH101", "Calculus", "Science", 1);
        System.out.println("Module created: " + module);

        // Create a Module Element
        ModuleElement moduleElement = new ModuleElement("ME101", "Calculus I", module, 0.5);
        System.out.println("Module Element created: " + moduleElement);

        // Create an Evaluation Method
        EvaluationMethod evaluationMethod = new EvaluationMethod("CC", 0.3);
        System.out.println("Evaluation Method created: " + evaluationMethod);

        // Create Grades
        Grade grade1 = new Grade("S123", professor.getCode(), moduleElement, 15, "validated", false);
        Grade grade2 = new Grade("S124", professor.getCode(), moduleElement, 18, "validated", false);
        List<Grade> grades = Arrays.asList(grade1, grade2);
        System.out.println("Grades created: " + grades);

        // Simple Validation
        for (Grade grade : grades) {
            boolean isWithinRange = grade.getGrade() >= 0 && grade.getGrade() <= 20;
            System.out.println("Grade " + grade + " within range: " + isWithinRange);
        }

        // Initialize Services
        GradeService gradeService = GradeService.getInstance();
        ModuleElementService moduleElementService = new ModuleElementService(null); // assuming null or dummy implementation for simplicity

        // Add Grades to Service
        gradeService.enterGrade(grade1);
        gradeService.enterGrade(grade2);

        // Initialize Controller
        ProfessorController professorController = new ProfessorController(gradeService, moduleElementService);

        // Export Grades to Excel
        System.out.println("Exporting grades to Excel...");
        professorController.exportGrades("ME101", "Excel");

        // Export Grades to PDF
        System.out.println("Exporting grades to PDF...");
        professorController.exportGrades("ME101", "PDF");
    }
}
