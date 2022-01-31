package pl.mateuszstefanski.silkroadnextgen.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserDto {

    @Email
    private String email;

    @Pattern(regexp = "([0-9]{3}\\s[0-9]{3}\\s[0-9]{3})|([0-9]{9})", message = "Allowed phone number formats: xxx xxx xxx or xxxxxxxxx")
    private String phone;

    @NotNull
    private String password;
}
