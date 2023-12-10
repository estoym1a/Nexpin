package com.javaprojects.nexpin.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String organization_service_code; //azerisiq abonent kodu, bazada saxlanilmir

    @ManyToOne
    @JoinColumn(name = "transactions_id")
    Transaction transactions;
}
