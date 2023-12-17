package com.javaprojects.nexpin.model.dto.response;

import com.javaprojects.nexpin.model.entity.TransactionType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class TransactionResponse {
    Long transaction_id;
    Long acc_id;
    Double amount;
    TransactionType transactionType;
    LocalDateTime transactionDate;

}
