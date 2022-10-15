package com.rmt.cloud.rent.services.RentCloudVehicleService.service;

import com.rmt.cloud.rent.commons.model.Vehicle;
import com.rmt.cloud.rent.services.RentCloudVehicleService.repository.VehicleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** VehicleServiceImpl */
@Service
public class VehicleServiceImpl implements VehicleService {

  @Autowired VehicleRepository vehicleRepository;

  @Override
  public Vehicle save(Vehicle vehicle) {
    return vehicleRepository.save(vehicle);
  }

  @Override
  public Vehicle fetch(int id) {
    Optional<Vehicle> vehicle = vehicleRepository.findById(id);
    if (vehicle.isPresent()) {
      return vehicle.get();
    }
    return null;
  }

  @Override
  public List<Vehicle> fetchAll() {
    return vehicleRepository.findAll();
  }
}
