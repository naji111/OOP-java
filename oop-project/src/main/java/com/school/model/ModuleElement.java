package com.school.model;

public class ModuleElement {
    private String code;
    private String name;
    private Module module;
    private double coefficient;

    public ModuleElement(String code, String name, Module module, double coefficient) {
        this.code = code;
        this.name = name;
        this.module = module;
        this.coefficient = coefficient;
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

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "ModuleElement{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", module=" + module +
                ", coefficient=" + coefficient +
                '}';
    }
}
