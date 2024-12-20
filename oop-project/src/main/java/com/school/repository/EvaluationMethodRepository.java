package com.school.repository;

import com.school.model.EvaluationMethod;

import java.util.List;

public interface EvaluationMethodRepository {
    void addEvaluationMethod(EvaluationMethod evaluationMethod);

    List<EvaluationMethod> getAllEvaluationMethods();

    void updateEvaluationMethod(EvaluationMethod evaluationMethod);

    void deleteEvaluationMethod(String evaluationMethodName);

    EvaluationMethod findEvaluationMethodByName(String evaluationMethodName);
}
