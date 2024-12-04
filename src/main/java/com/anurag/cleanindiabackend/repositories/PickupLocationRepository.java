package com.anurag.cleanindiabackend.repositories;

import com.anurag.cleanindiabackend.models.PickupLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickupLocationRepository extends JpaRepository<PickupLocation, Long> {
}
