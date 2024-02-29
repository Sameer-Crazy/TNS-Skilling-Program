package com.tnsif.placement_management.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.tnsif.placement_management.model.Placement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placement_management.repository.PlacementRepository;

@RestController
public class PlacementManagementController {

    @GetMapping("/")
    public String getHello(){
        return "<h1>Welcome to Placement Management System!</h1>";
    }

    @Autowired
    PlacementRepository placementRepository;

    @GetMapping("/list-placement")
    public List<Placement> getPlacementList(){
        return placementRepository.findAll();
    }

    @GetMapping("/list-placement/{id}")
    public Placement getPlacementById(@PathVariable("id") Integer id){
        return placementRepository.findById(id).get();
    }

    @PostMapping("/add-placement")
    public Placement addPlacement(@RequestBody Map<String, String> body){
        // long id = Long.parseLong(body.get("id"));
        String companyName = body.get("company_name");
        String jobTitle = body.get("job_title");
        LocalDate placementDate = LocalDate.parse(body.get("placement_date"));
        long studentId = Long.parseLong(body.get("student_id"));

        Placement newPlacement = new Placement(companyName,jobTitle,placementDate,studentId);
        placementRepository.save(newPlacement);

        return newPlacement;
    }

    @PutMapping("/edit-placement/{id}")
    public Placement updatePlacementById(@PathVariable("id") Integer id, @RequestBody Map<String, String> body){

            Placement item = placementRepository.findById(id).get();
            item.setCompanyName(body.get("company_name"));
            item.setJobTitle(body.get("job_title"));
            item.setPlacementDate(body.get("placement_date"));
            item.setStudentId(body.get("student_id"));
            placementRepository.save(item);

            return item;
    }

    @DeleteMapping("/remove-placement/{id}")
    public String deleteRow(@PathVariable("id") Integer id){
        if(placementRepository.findById(id)==null){
            return "Record Doesn't exist";
        }
        placementRepository.deleteById(id);
        return "Record with id = "+id+" has been deleted";
    }
}
