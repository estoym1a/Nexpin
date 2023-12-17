package com.javaprojects.nexpin.model.dto.request;

import com.javaprojects.nexpin.model.entity.AccountType;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import org.yaml.snakeyaml.events.Event;

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
    @NotBlank(message = ACCOUNT_TYPE_URGENT)
    AccountType accountType;
    @NotBlank(message = CURRENCY_URGENT)
    String currency;
}
