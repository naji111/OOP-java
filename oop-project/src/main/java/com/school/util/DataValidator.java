package com.school.util;

import com.school.model.Grade;

import java.util.List;

public class DataValidator {

    // Validate if all grades are entered
    public static boolean allGradesEntered(List<Grade> grades) {
        for (Grade grade : grades) {
            if (grade.getGrade() == -1) { // Assuming -1 indicates a missing grade
                return false;
            }
        }
        return true;
    }

    // Validate if all grades are within the valid range
    public static boolean allGradesWithinRange(List<Grade> grades) {
        for (Grade grade : grades) {
            if (grade.getGrade() < 0 || grade.getGrade() > 20) {
                return false;
            }
        }
        return true;
    }

    // Validate the presence of 0 or 20 in grades
    public static boolean containsExtremeGrades(List<Grade> grades) {
        for (Grade grade : grades) {
            if (grade.getGrade() == 0 || grade.getGrade() == 20) {
                return true;
            }
        }
        return false;
    }

    // Validate if an absent student is correctly marked
    public static boolean validateAbsentees(List<Grade> grades) {
        for (Grade grade : grades) {
            if (grade.isAbsent() && grade.getGrade() != 0) {
                return false;
            }
        }
        return true;
    }
}
