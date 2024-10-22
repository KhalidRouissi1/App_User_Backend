package com.khaled.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "diagnosis", types = { ClinicalRecord.class })
public interface ClinicalRecordProjection {
    public String getDiagnosis();
}
