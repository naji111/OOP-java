package com.school.repository;

import com.school.model.Module;

import java.util.List;

public interface ModuleRepository {
    void addModule(Module module);

    List<Module> getAllModules();

    void updateModule(Module module);

    void deleteModule(String moduleCode);

    Module findModuleByCode(String moduleCode);
}
