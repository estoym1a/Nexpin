package com.javaprojects.nexpin.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double amount;
    LocalDate transaction_date;
    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;


    @ManyToOne
    @JoinColumn(name = "transaction_type_id")
    TransactionType transactionType;
}
