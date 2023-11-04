package lk.ijse.carRentSystem.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Car {

    @Id
    private String carRegNo;
    private String brand;
    private String carType;
    private String color;
    private String fuelType;
    private String trnType;
    private int Passengers;
    private double mValue;
    private String dayRateKm;
    private String monthRateKm;
    private double dayRateRs;
    private double monthRateRs;
    private String freeKmDay;
    private String freeKmMonth;
    private double extraKmRs;
    private double damageCost;
    private String carAvailability;
    private String frontImage;
    private String sideImage;
    private String backImage;
    private String interiorImage;

}
