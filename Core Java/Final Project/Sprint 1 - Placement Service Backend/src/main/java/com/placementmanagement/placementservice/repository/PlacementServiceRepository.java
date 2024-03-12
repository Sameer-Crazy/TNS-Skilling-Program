package com.placementmanagement.placementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementmanagement.placementservice.model.Placement;

public interface PlacementServiceRepository extends JpaRepository<Placement,Long>{
    
}
