package com.javaprojects.nexpin.model.dto.request;

import jakarta.validation.constraints.NotBlank;
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
public class AccountCreationRequest {
    @NotBlank(message = ID_URGENT)
    Long id;

    @NotBlank(message = CURRENCY_URGENT)
    String currency;
}
