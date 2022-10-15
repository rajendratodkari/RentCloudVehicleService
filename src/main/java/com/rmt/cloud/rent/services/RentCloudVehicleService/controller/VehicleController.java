package com.rmt.cloud.rent.services.RentCloudVehicleService.controller;

import com.rmt.cloud.rent.commons.model.Vehicle;
import com.rmt.cloud.rent.services.RentCloudVehicleService.service.VehicleServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** VehicleController */
@RestController
@RequestMapping(value = "/service")
public class VehicleController {

  @Autowired VehicleServiceImpl vehicleServiceImpl;

  @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
  public Vehicle save(@RequestBody Vehicle vehicle) {
    return vehicleServiceImpl.save(vehicle);
  }

  @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
  public ResponseEntity<Vehicle> fetch(@RequestParam int id) {
    Vehicle vehicle = vehicleServiceImpl.fetch(id);
    if (vehicle == null) {
      return ResponseEntity.notFound().build();
    } else {
      return ResponseEntity.ok(vehicle);
    }
  }

  @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
  public List<Vehicle> fetchAll() {
    return vehicleServiceImpl.fetchAll();
  }
}
