package com.school.service;

import com.school.model.Module;
import com.school.repository.ModuleRepository;

import java.util.List;

public class ModuleService {
    private final ModuleRepository moduleRepository;

    public ModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }


        private static ModuleService instance;


        public static synchronized ModuleService getInstance(ModuleRepository moduleRepository) {
            if (instance == null) {
                instance = new ModuleService(moduleRepository);
            }
            return instance;
        }






    // Add Module
    public void addModule(Module module) {
        moduleRepository.addModule(module);
    }

    // Get All Modules
    public List<Module> getAllModules() {
        return moduleRepository.getAllModules();
    }

    // Update Module
    public void updateModule(Module module) {
        moduleRepository.updateModule(module);
    }

    // Delete Module
    public void deleteModule(String moduleCode) {
        moduleRepository.deleteModule(moduleCode);
    }

    // Find Module by Code
    public Module findModuleByCode(String moduleCode) {
        return moduleRepository.findModuleByCode(moduleCode);
    }
}
