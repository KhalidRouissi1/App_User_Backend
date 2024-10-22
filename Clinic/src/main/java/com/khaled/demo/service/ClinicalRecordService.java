package com.khaled.demo.service;

import java.util.List;

import com.khaled.demo.entities.ClinicalRecord;
import com.khaled.demo.entities.Patient;

public interface ClinicalRecordService {
    ClinicalRecord saveClinicalRecord(ClinicalRecord cr);
    ClinicalRecord updateClinicalRecord(ClinicalRecord cr);
    void deleteClinicalRecord(ClinicalRecord cr);
    void deleteClinicalRecordById(Long id);
    ClinicalRecord getClinicalRecord(Long id);
    List<ClinicalRecord> getAllClinicalRecords();

    List<ClinicalRecord> findByTitle(String title);
    List<ClinicalRecord> findByTitleContains(String title);
    List<ClinicalRecord> findByTitleAndPatient(String title, Patient patient);
    List<ClinicalRecord> findByPatientId(Long patientId);
    List<ClinicalRecord> findByOrderByTitleAsc();
    List<ClinicalRecord> findByTitleAndDuration(String title, Integer duration);
    List<ClinicalRecord> findByPatient(Patient patient);
    List<ClinicalRecord> sortClinicalRecordsByTitleAndDuration();
}
