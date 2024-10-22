package com.khaled.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String diagnosis;
    private String treatment;
    private Integer durationOfStay;
    private String doctorName;
    private LocalDateTime dateOfRecord;

    @ManyToOne
    private Patient patient;
}
