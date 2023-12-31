package com.javaprojects.nexpin.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String transaction_name; //APTEK
    String category; //deposit and withdrawal - create enum if needed

    @OneToMany(mappedBy = "transactionType")
    List<Transaction> transactions;
}
