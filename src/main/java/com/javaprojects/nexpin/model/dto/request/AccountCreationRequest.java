package com.javaprojects.nexpin.model.dto.request;

import com.javaprojects.nexpin.model.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import static com.javaprojects.nexpin.model.constant.Messages.*;

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

    @NotBlank(message = ACCOUNT_TYPE_URGENT) // select bar
    AccountType accountType;
}
