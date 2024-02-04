package com.learning.spring.springweb;

import jakarta.validation.constraints.*;

import java.time.LocalDate;


public record User(
        @NotBlank(message = "Name does not blank")
        String name,

        @NotBlank(message = "Surname does not blank")
        String surname,

        @Min(12)
        @Max(100)
        Integer age,

        @Email(message = "Email must be valid")
        @NotBlank(message = "email does not blank")
        String email,

        String TCNo,

        @PastOrPresent
        LocalDate birthDate,

        @Size(max = 250)
        String address,

        @NotBlank(message = "username does not blank")
        String username

) {

    @AssertTrue(message = "username cannot be 'admin'")
    public boolean isUsernameValid() {
        return !username.equals("admin");
    }

}
