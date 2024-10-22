package com.khaled.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khaled.demo.entities.ClinicalRecord;
import com.khaled.demo.entities.Patient;
import com.khaled.demo.repos.ClinicalRecordRepository;

@Service
public class ClinicalRecordServiceImpl implements ClinicalRecordService {

    @Autowired
    ClinicalRecordRepository clinicalRecordRepository;

    @Override
    public ClinicalRecord saveClinicalRecord(ClinicalRecord cr) {
        return clinicalRecordRepository.save(cr);
    }

    @Override
    public ClinicalRecord updateClinicalRecord(ClinicalRecord cr) {
        return clinicalRecordRepository.save(cr);
    }

    @Override
    public void deleteClinicalRecord(ClinicalRecord cr) {
        clinicalRecordRepository.delete(cr);
    }

    @Override
    public void deleteClinicalRecordById(Long id) {
        clinicalRecordRepository.deleteById(id);
    }

    @Override
    public ClinicalRecord getClinicalRecord(Long id) {
        return clinicalRecordRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClinicalRecord> getAllClinicalRecords() {
        return clinicalRecordRepository.findAll();
    }

    @Override
    public List<ClinicalRecord> findByTitle(String title) {
        return clinicalRecordRepository.findByTitle(title);
    }

    @Override
    public List<ClinicalRecord> findByTitleContains(String title) {
        return clinicalRecordRepository.findByTitleContains(title);
    }

    @Override
    public List<ClinicalRecord> findByTitleAndPatient(String title, Patient patient) {
        return clinicalRecordRepository.findByTitleAndPatient(title, patient);
    }

    @Override
    public List<ClinicalRecord> findByPatientId(Long patientId) {
        return clinicalRecordRepository.findByPatientId(patientId);
    }

    @Override
    public List<ClinicalRecord> findByOrderByTitleAsc() {
        return clinicalRecordRepository.findByOrderByTitleAsc();
    }

    @Override
    public List<ClinicalRecord> findByTitleAndDuration(String title, Integer duration) {
        return clinicalRecordRepository.findByTitleAndDuration(title, duration);
    }

    @Override
    public List<ClinicalRecord> findByPatient(Patient patient) {
        return clinicalRecordRepository.findByPatient(patient);
    }

    @Override
    public List<ClinicalRecord> sortClinicalRecordsByTitleAndDuration() {
        return clinicalRecordRepository.sortClinicalRecordsByTitleAndDuration();
    }
}
