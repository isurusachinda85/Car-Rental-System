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
public class Driver {

    @Id
    private String driNic;
    private String driName;
    private String driEmail;
    private String driAddress;
    private String driLicense;
    private String drContactNo;
    private String drAvailable;
    private String driUsername;
    private String driPassword;
    private String drComPassword;
    private String drRoleType;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    private String drLicenseImage;
    private String driNicImage;

}
