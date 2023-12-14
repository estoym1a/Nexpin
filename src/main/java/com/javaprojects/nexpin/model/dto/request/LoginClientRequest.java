package com.javaprojects.nexpin.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import static com.javaprojects.nexpin.model.constant.Constants.PASSWORD_URGENT;
import static com.javaprojects.nexpin.model.constant.Constants.USERNAME_URGENT;
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class LoginClientRequest {
    @NotBlank(message = USERNAME_URGENT)
    String userName;

    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "PASSWORD_REGEX")
    @NotBlank(message = PASSWORD_URGENT)
    String password;

}
