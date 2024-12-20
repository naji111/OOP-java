package com.school.util;

import com.school.model.Grade;

import java.util.List;

public interface GradeExporter {
    void export(List<Grade> grades);
}
