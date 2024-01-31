package lk.ijse.carRentSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDTO {

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
    private String roleType;
}
