package lk.ijse.carRentSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    private String cusNic;

    private String cusName;
    private String cusEmail;
    private String cusAddress;
    private String cusLicense;
    private String contactNo;
    private String cusUsername;
    private String cusPassword;
    private String cusComPassword;
    private String nicImg;
    private String licenseImg;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    private String roleType;
}
