package com.khaled.demo.service;

import java.util.List;

import com.khaled.demo.entities.Patient;

public interface PatientService {
    Patient savePatient(Patient p);
    Patient updatePatient(Patient p);
    void deletePatient(Patient p);
    void deletePatientById(Long id);
    Patient getPatient(Long id);
    List<Patient> getAllPatients();

    List<Patient> findByName(String name);
    List<Patient> findByNameContains(String name);
    List<Patient> findByOrderByNameAsc();
    List<Patient> findByNameAndDoctorName(String name, String doctorName);
}
