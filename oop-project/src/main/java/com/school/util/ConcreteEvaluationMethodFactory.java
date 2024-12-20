package com.school.util;

import com.school.model.EvaluationMethod;

public class ConcreteEvaluationMethodFactory extends EvaluationMethodFactory {
    @Override
    public EvaluationMethod createEvaluationMethod(String type, double coefficient) {
        switch (type) {
            case "CC":
                return new EvaluationMethod("CC", coefficient);
            case "TP":
                return new EvaluationMethod("TP", coefficient);
            case "Project":
                return new EvaluationMethod("Project", coefficient);
            case "Presentation":
                return new EvaluationMethod("Presentation", coefficient);
            default:
                throw new IllegalArgumentException("Unknown evaluation method type: " + type);
        }
    }
}
