package com.school.model;

public class EvaluationMethod {
    private String name;
    private double coefficient;

    public EvaluationMethod(String name, double coefficient) {
        this.name = name;
        this.coefficient = coefficient;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "EvaluationMethod{" +
                "name='" + name + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }
}
