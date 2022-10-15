package com.rmt.cloud.rent.services.RentCloudVehicleService.repository;

import com.rmt.cloud.rent.commons.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/** VehicleRepository */
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {}
