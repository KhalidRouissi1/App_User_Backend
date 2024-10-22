package com.khaled.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.khaled.demo.entities.Patient;



public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findByName(String name);

    List<Patient> findByNameContains(String name);

    List<Patient> findByOrderByNameAsc();

    @Query("SELECT p FROM Patient p WHERE p.name LIKE %:name% AND p.gender = :doctorName")
    List<Patient> findByNameAndDoctorName(@Param("name") String name, @Param("doctorName") String doctorName);

}