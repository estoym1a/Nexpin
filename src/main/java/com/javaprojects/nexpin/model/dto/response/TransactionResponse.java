package com.javaprojects.nexpin.model.dto.response;

import com.javaprojects.nexpin.model.enums.TransactionType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import java.util.Date;

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
    Date transactionDate;

}
