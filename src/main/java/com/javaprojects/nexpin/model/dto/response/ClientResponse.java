package com.javaprojects.nexpin.model.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientResponse {
    Long id;
    String userName;
    String fullName;
    String email;
    String phoneNumber;
    Boolean is_active;
}
