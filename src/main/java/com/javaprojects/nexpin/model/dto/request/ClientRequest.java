package com.javaprojects.nexpin.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import static com.javaprojects.nexpin.model.constant.Constants.*;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class ClientRequest {


    @NotBlank(message = FULLNAME_URGENT)
    String fullName;


    @Pattern(regexp = "^(\\+[0-9]{1,4}[-.\\s]?)?((\\([0-9]{1,4}\\))|[0-9]{1,4})[-.\\s]?[0-9]{1,14}$",
            message = INVALID_PHONE)
    @NotBlank(message = INVALID_PHONE)
    String phoneNumber;
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "PASSWORD_REGEX")
    @NotBlank(message = PASSWORD_URGENT)
    String password;
}
