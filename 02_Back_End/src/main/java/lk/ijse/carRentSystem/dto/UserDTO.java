package lk.ijse.carRentSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {

    private String cusNic;

    private String username;
    private String password;
    private String role;
}
