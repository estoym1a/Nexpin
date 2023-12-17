package com.javaprojects.nexpin.model.dto.response;

import com.javaprojects.nexpin.model.entity.AccountType;

public class AccountCreationResponse {
    Long acc_id;
    Long client_id;
    String acc_number;
    Double balance;
    AccountType accountType;
    String currency;

}
