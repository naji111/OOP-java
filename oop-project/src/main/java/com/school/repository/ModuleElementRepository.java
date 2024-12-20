package com.school.repository;

import com.school.model.ModuleElement;

import java.util.List;

public interface ModuleElementRepository {
    void addModuleElement(ModuleElement moduleElement);

    List<ModuleElement> getAllModuleElements();

    void updateModuleElement(ModuleElement moduleElement);

    void deleteModuleElement(String moduleElementCode);

    ModuleElement findModuleElementByCode(String moduleElementCode);

    List<ModuleElement> getElementsHandledByProfessor(String professorId);
}
