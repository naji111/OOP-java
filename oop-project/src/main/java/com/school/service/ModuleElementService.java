package com.school.service;

import com.school.model.ModuleElement;
import com.school.repository.ModuleElementRepository;

import java.util.List;

public class ModuleElementService {
    private final ModuleElementRepository moduleElementRepository;

    public ModuleElementService(ModuleElementRepository moduleElementRepository) {
        this.moduleElementRepository = moduleElementRepository;
    }

    // Add Module Element
    public void addModuleElement(ModuleElement moduleElement) {
        moduleElementRepository.addModuleElement(moduleElement);
    }



        private static ModuleElementService instance;

        public static synchronized ModuleElementService getInstance(ModuleElementRepository moduleElementRepository) {
            if (instance == null) {
                instance = new ModuleElementService(moduleElementRepository);
            }
            return instance;
        }





    // Get All Module Elements
    public List<ModuleElement> getAllModuleElements() {
        return moduleElementRepository.getAllModuleElements();
    }

    // Update Module Element
    public void updateModuleElement(ModuleElement moduleElement) {
        moduleElementRepository.updateModuleElement(moduleElement);
    }

    // Delete Module Element
    public void deleteModuleElement(String moduleElementCode) {
        moduleElementRepository.deleteModuleElement(moduleElementCode);
    }

    // Find Module Element by Code
    public ModuleElement findModuleElementByCode(String moduleElementCode) {
        return moduleElementRepository.findModuleElementByCode(moduleElementCode);
    }

    // Get Elements Handled by Professor
    public List<ModuleElement> getElementsHandledByProfessor(String professorId) {
        return moduleElementRepository.getElementsHandledByProfessor(professorId);
    }
}
