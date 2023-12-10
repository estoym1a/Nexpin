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
public class Cashback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double refund_amount;
    @ManyToOne
    @JoinColumn(name = "transaction_id")
    Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;

}

