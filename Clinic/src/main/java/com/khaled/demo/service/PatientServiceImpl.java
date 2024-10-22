package com.khaled.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khaled.demo.entities.Patient;
import com.khaled.demo.repos.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public Patient updatePatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public void deletePatient(Patient p) {
        patientRepository.delete(p);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient getPatient(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> findByName(String name) {
        return patientRepository.findByName(name);
    }

    @Override
    public List<Patient> findByNameContains(String name) {
        return patientRepository.findByNameContains(name);
    }

    @Override
    public List<Patient> findByOrderByNameAsc() {
        return patientRepository.findByOrderByNameAsc();
    }

    @Override
    public List<Patient> findByNameAndDoctorName(String name, String doctorName) {
        return patientRepository.findByNameAndDoctorName(name, doctorName);
    }
}
