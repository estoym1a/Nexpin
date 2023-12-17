package com.javaprojects.nexpin.model.dto.request;

import com.javaprojects.nexpin.enums.Actions;
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
public class CardManagementRequest {
    @NotBlank(message = CLIENT_ID_URGENT)
    Long client_id;
    @NotBlank(message = ACCOUNT_ID_URGENT)
    Long acc_id;
    @NotBlank(message = ACTION_URGENT)
    Actions action;
}
