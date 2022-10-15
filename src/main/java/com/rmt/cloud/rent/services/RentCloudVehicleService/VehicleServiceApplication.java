package com.rmt.cloud.rent.services.RentCloudVehicleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.rmt.cloud.rent.commons.model")
public class VehicleServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(VehicleServiceApplication.class, args);
  }
}
