package com.school.model;

public class Professor {
    private String firstName;
    private String lastName;
    private String specialty;
    private String code;

    public Professor(String firstName, String lastName, String specialty, String code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.code = code;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
