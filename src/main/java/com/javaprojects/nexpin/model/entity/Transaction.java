package com.javaprojects.nexpin.model.entity;

import com.javaprojects.nexpin.model.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;
import java.util.List;

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
    Date transaction_date;
    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;

    @JoinColumn(name = "transaction_type_id")
    @Enumerated(EnumType.STRING)
    TransactionType transactionType;


    @OneToMany(mappedBy = "transaction")
    List<TransactionDetails> transactionDetails ;

}
