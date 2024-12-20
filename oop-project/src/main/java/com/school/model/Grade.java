package com.school.model;

public class Grade {
    private String studentId;
    private String professorId;
    private ModuleElement moduleElement;
    private double grade;
    private String status; // "draft", "validated"
    private boolean isAbsent;

    public Grade(String studentId, String professorId, ModuleElement moduleElement, double grade, String status, boolean isAbsent) {
        this.studentId = studentId;
        this.professorId = professorId;
        this.moduleElement = moduleElement;
        this.grade = grade;
        this.status = status;
        this.isAbsent = isAbsent;
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public ModuleElement getModuleElement() {
        return moduleElement;
    }

    public void setModuleElement(ModuleElement moduleElement) {
        this.moduleElement = moduleElement;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    public void setAbsent(boolean absent) {
        isAbsent = absent;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "studentId='" + studentId + '\'' +
                ", professorId='" + professorId + '\'' +
                ", moduleElement=" + moduleElement +
                ", grade=" + grade +
                ", status='" + status + '\'' +
                ", isAbsent=" + isAbsent +
                '}';
    }
}
