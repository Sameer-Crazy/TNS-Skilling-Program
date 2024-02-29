package com.tnsif.placement_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placement_management.model.Placement;


public interface PlacementRepository extends JpaRepository<Placement,Integer>{
    
}
