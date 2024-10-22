package com.khaled.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.khaled.demo.entities.ClinicalRecord;
import com.khaled.demo.service.ClinicalRecordService;

@RestController
@RequestMapping("/clinicalrecords")
public class ClinicalRecordController {

    @Autowired
    ClinicalRecordService clinicalRecordService;

    @GetMapping
    public List<ClinicalRecord> getAllClinicalRecords() {
        return clinicalRecordService.getAllClinicalRecords();
    }

    @GetMapping("/{id}")
    public ClinicalRecord getClinicalRecordById(@PathVariable Long id) {
        return clinicalRecordService.getClinicalRecord(id);
    }

    @PostMapping
    public ClinicalRecord createClinicalRecord(@RequestBody ClinicalRecord clinicalRecord) {
        return clinicalRecordService.saveClinicalRecord(clinicalRecord);
    }

    @PutMapping("/{id}")
    public ClinicalRecord updateClinicalRecord(@PathVariable Long id, @RequestBody ClinicalRecord clinicalRecord) {
        clinicalRecord.setId(id);
        return clinicalRecordService.updateClinicalRecord(clinicalRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteClinicalRecord(@PathVariable Long id) {
        clinicalRecordService.deleteClinicalRecordById(id);
    }
}
