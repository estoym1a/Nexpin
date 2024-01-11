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
public class LoginClientResponse {
    Long id;
    String fullName;
    String token;

}
