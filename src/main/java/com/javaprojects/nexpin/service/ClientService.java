package com.javaprojects.nexpin.service;

import com.javaprojects.nexpin.model.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Client updateClientParameter(Long clientId, String fieldName, Object updatedValue);

    Client getClientById(Long ClientId);

    List<Client> getAllClients();

    Client changePassword(Long ClientId, String newPassword);
}
