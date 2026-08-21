package org.example.dtos.account;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class RegisterDto {
    @NotBlank //Required
    private String username;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
    @NotBlank
    private String confirmPassword;

    private MultipartFile image;
}
