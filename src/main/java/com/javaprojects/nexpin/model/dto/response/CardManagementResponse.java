package com.javaprojects.nexpin.model.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class CardManagementResponse {
    Long card_id;
    Long client_id;

}
