package com.school.model;

public class Module {
    private String code;
    private String name;
    private String course;
    private int semester;

    public Module(String code, String name, String course, int semester) {
        this.code = code;
        this.name = name;
        this.course = course;
        this.semester = semester;
    }

    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", semester=" + semester +
                '}';
    }
}
