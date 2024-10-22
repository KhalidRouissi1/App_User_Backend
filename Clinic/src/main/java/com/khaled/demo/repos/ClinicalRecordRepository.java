package com.khaled.demo.repos;
import java.util.List;

import com.khaled.demo.entities.ClinicalRecord;
import com.khaled.demo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClinicalRecordRepository extends JpaRepository<ClinicalRecord, Long> {

    List<ClinicalRecord> findByTitle(String title);

    List<ClinicalRecord> findByTitleContains(String title);

    @Query("select cr from ClinicalRecord cr where cr.title like %:title% and cr.patient = :patient")
    List<ClinicalRecord> findByTitleAndPatient(@Param("title") String title, @Param("patient") Patient patient);

    @Query("select cr from ClinicalRecord cr where cr.patient.id = :patientId")
    List<ClinicalRecord> findByPatientId(@Param("patientId") Long patientId);

    List<ClinicalRecord> findByOrderByTitleAsc();

    List<ClinicalRecord> findByTitleAndDuration(String title, Integer duration);

    List<ClinicalRecord> findByPatient(Patient patient);

    @Query("SELECT cr FROM ClinicalRecord cr ORDER BY cr.diagnosis ASC, cr.durationOfStay ASC")
    List<ClinicalRecord> sortClinicalRecordsByTitleAndDuration();
}