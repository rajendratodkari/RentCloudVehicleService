package com.rmt.cloud.rent.services.RentCloudVehicleService.service;

import com.rmt.cloud.rent.commons.model.Vehicle;
import java.util.List;

/** VehicleService */
public interface VehicleService {

  Vehicle save(Vehicle vehicle);

  Vehicle fetch(int id);

  List<Vehicle> fetchAll();
}
