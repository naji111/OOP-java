package com.school.service;

import com.school.model.EvaluationMethod;
import com.school.repository.EvaluationMethodRepository;

import java.util.List;

public class EvaluationMethodService {
    private final EvaluationMethodRepository evaluationMethodRepository;

    public EvaluationMethodService(EvaluationMethodRepository evaluationMethodRepository) {
        this.evaluationMethodRepository = evaluationMethodRepository;
    }


        private static EvaluationMethodService instance;


        public static synchronized EvaluationMethodService getInstance(EvaluationMethodRepository evaluationMethodRepository) {
            if (instance == null) {
                instance = new EvaluationMethodService(evaluationMethodRepository);
            }
            return instance;
        }





    // Add Evaluation Method
    public void addEvaluationMethod(EvaluationMethod evaluationMethod) {
        evaluationMethodRepository.addEvaluationMethod(evaluationMethod);
    }

    // Get All Evaluation Methods
    public List<EvaluationMethod> getAllEvaluationMethods() {
        return evaluationMethodRepository.getAllEvaluationMethods();
    }

    // Update Evaluation Method
    public void updateEvaluationMethod(EvaluationMethod evaluationMethod) {
        evaluationMethodRepository.updateEvaluationMethod(evaluationMethod);
    }

    // Delete Evaluation Method
    public void deleteEvaluationMethod(String evaluationMethodName) {
        evaluationMethodRepository.deleteEvaluationMethod(evaluationMethodName);
    }

    // Find Evaluation Method by Name
    public EvaluationMethod findEvaluationMethodByName(String evaluationMethodName) {
        return evaluationMethodRepository.findEvaluationMethodByName(evaluationMethodName);
    }
}
