package com.school.service;

import com.school.model.Professor;
import com.school.repository.ProfessorRepository;

import java.util.List;

public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }


    private static ProfessorService instance;

    public static synchronized ProfessorService getInstance(ProfessorRepository professorRepository) {
            if (instance == null) {
                instance = new ProfessorService(professorRepository);
            }
            return instance;
        }









    // Add Professor
    public void addProfessor(Professor professor) {
        professorRepository.addProfessor(professor);
    }

    // Get All Professors
    public List<Professor> getAllProfessors() {
        return professorRepository.getAllProfessors();
    }

    // Update Professor
    public void updateProfessor(Professor professor) {
        professorRepository.updateProfessor(professor);
    }

    // Delete Professor
    public void deleteProfessor(String professorCode) {
        professorRepository.deleteProfessor(professorCode);
    }

    // Find Professor by Code
    public Professor findProfessorByCode(String professorCode) {
        return professorRepository.findProfessorByCode(professorCode);
    }
}
