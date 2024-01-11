package com.javaprojects.nexpin.model.dto.request;

import com.javaprojects.nexpin.model.entity.TransactionType;
import jakarta.validation.constraints.Max;
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
public class TransactionRequest {
    @NotBlank(message = ACCOUNT_ID_URGENT)
    Long acc_id;
    @NotBlank(message = AMOUNT_URGENT)
    Double amount;
    @Max(value = 1000, message = EXCEED_LIMIT)
    @NotBlank(message = TRANSACTION_TYPE_URGENT)
    TransactionType transactionType;
    @NotBlank(message = CURRENCY_URGENT)
    String currency;


}
