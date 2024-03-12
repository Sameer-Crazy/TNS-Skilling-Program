package com.placementmanagement.placementservice.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placementmanagement.placementservice.model.Placement;
import com.placementmanagement.placementservice.repository.PlacementServiceRepository;

@RestController
@RequestMapping("/placement")
@CrossOrigin(origins = "http://localhost:4200")
public class PlacementServiceController {
    
    @Autowired
    PlacementServiceRepository db;
    
    @GetMapping("")
    public List<Placement> getPlacements(){
        return db.findAll();
    }
    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable("id") long id){
        return db.findById(id).get();
    }
    @PostMapping("")
    public Placement addPlacement(@RequestBody Map<String, String> body){
        String companyName = body.get("companyName");
        String jobTitle = body.get("jobTitle");
        LocalDate placementDate = LocalDate.parse(body.get("placementDate"));
        Long studentId = Long.parseLong(body.get("studentId"));
        Placement newPlacement = new Placement(companyName, jobTitle, placementDate, studentId);
        db.save(newPlacement);
        return newPlacement;
    }
    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable("id") long id, @RequestBody Map<String, String> body){
        Placement existingPlacement = db.findById(id).get();
        existingPlacement.setCompanyName(body.get("companyName"));
        existingPlacement.setJobTitle(body.get("jobTitle"));
        existingPlacement.setPlacementDate(LocalDate.parse(body.get("placementDate")));
        existingPlacement.setStudentId(Long.parseLong(body.get("studentId")));
        db.save(existingPlacement);
        return existingPlacement;
    }
    @DeleteMapping("/{id}")
    public Placement removePlacement(@PathVariable("id") long id){
        Placement placement = db.findById(id).get();
        db.deleteById(id);
        return placement;
    }
}
