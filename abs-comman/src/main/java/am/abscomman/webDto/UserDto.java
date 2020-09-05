package am.abscomman.webDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {

    private String name;
    private String surname;
    private String mainPhoto;
    private String gender;
    private String city;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private String confirmPassword;
}
