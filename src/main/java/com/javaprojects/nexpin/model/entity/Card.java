package com.javaprojects.nexpin.model.entity;

import com.javaprojects.nexpin.model.enums.Actions;
import com.javaprojects.nexpin.model.enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String card_name;
    Date expire_month;
    Date expire_year;
    String pan; //16-digit number
    Integer cvc;

    @Enumerated(EnumType.STRING)
    @Column(name = "action ")
    Actions action;

    @Enumerated(EnumType.STRING)
    @Column(name = "status ")
    CardStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Client client;

    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;


}