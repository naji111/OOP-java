package com.school.controller;

import com.school.model.*;
import com.school.model.Module;
import com.school.service.*;

import java.util.List;

public class AdminController {
    private final ProfessorService professorService;
    private final ModuleService moduleService;
    private final ModuleElementService moduleElementService;
    private final EvaluationMethodService evaluationMethodService;
    private final UserService userService;

    public AdminController(ProfessorService professorService, ModuleService moduleService, ModuleElementService moduleElementService,
                           EvaluationMethodService evaluationMethodService, UserService userService) {
        this.professorService = professorService;
        this.moduleService = moduleService;
        this.moduleElementService = moduleElementService;
        this.evaluationMethodService = evaluationMethodService;
        this.userService = userService;
    }

    // Manage Professors
    public void addProfessor(Professor professor) {
        professorService.addProfessor(professor);
    }

    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }

    public void updateProfessor(Professor professor) {
        professorService.updateProfessor(professor);
    }

    public void deleteProfessor(String professorCode) {
        professorService.deleteProfessor(professorCode);
    }

    // Manage Modules
    public void addModule(Module module) {
        moduleService.addModule(module);
    }

    public List<Module> getAllModules() {
        return moduleService.getAllModules();
    }

    public void updateModule(Module module) {
        moduleService.updateModule(module);
    }

    public void deleteModule(String moduleCode) {
        moduleService.deleteModule(moduleCode);
    }

    // Manage Module Elements
    public void addModuleElement(ModuleElement moduleElement) {
        moduleElementService.addModuleElement(moduleElement);
    }

    public List<ModuleElement> getAllModuleElements() {
        return moduleElementService.getAllModuleElements();
    }

    public void updateModuleElement(ModuleElement moduleElement) {
        moduleElementService.updateModuleElement(moduleElement);
    }

    public void deleteModuleElement(String moduleElementCode) {
        moduleElementService.deleteModuleElement(moduleElementCode);
    }

    // Manage Evaluation Methods
    public void addEvaluationMethod(EvaluationMethod evaluationMethod) {
        evaluationMethodService.addEvaluationMethod(evaluationMethod);
    }

    public List<EvaluationMethod> getAllEvaluationMethods() {
        return evaluationMethodService.getAllEvaluationMethods();
    }

    public void updateEvaluationMethod(EvaluationMethod evaluationMethod) {
        evaluationMethodService.updateEvaluationMethod(evaluationMethod);
    }

    public void deleteEvaluationMethod(String evaluationMethodName) {
        evaluationMethodService.deleteEvaluationMethod(evaluationMethodName);
    }

    // Manage User Accounts
    public void addUser(User user) {
        userService.addUser(user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public void updateUser(User user) {
        userService.updateUser(user);
    }

    public void deleteUser(String username) {
        userService.deleteUser(username);
    }
}
