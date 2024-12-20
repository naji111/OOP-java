package com.school.util;

import com.school.model.EvaluationMethod;

public abstract class EvaluationMethodFactory {
    public abstract EvaluationMethod createEvaluationMethod(String type, double coefficient);

    public static EvaluationMethodFactory getFactory() {
        return new ConcreteEvaluationMethodFactory();
    }
}
