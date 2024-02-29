package com.tnsif.placement_management.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="placement_date")
    private LocalDate placementDate;

    @Column(name="student_id")
    private long studentId;

    public Placement(){
        
    }
    
    public Placement(String companyName, String jobTitle, LocalDate placementDate, long studentId) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.placementDate = placementDate;
        this.studentId = studentId;
    }
    public long getId() {
        return id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public LocalDate getPlacementDate() {
        return placementDate;
    }
    public void setPlacementDate(String placementDate) {
        this.placementDate = LocalDate.parse(placementDate);
    }
    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = Long.parseLong(studentId);
    }
    
}
