package com.school.repository;

import com.school.model.Professor;

import java.util.List;

public interface ProfessorRepository {
    void addProfessor(Professor professor);

    List<Professor> getAllProfessors();

    void updateProfessor(Professor professor);

    void deleteProfessor(String professorCode);

    Professor findProfessorByCode(String professorCode);
}
