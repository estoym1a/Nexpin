package com.javaprojects.nexpin.service;

import com.javaprojects.nexpin.model.entity.Client;

import java.util.List;

public interface ClientService {
    Client registerNewClient(Client client);

    Client updateClientDetails(Long ClientId, Client client);

    void deleteClient(Long ClientId);

    Client getClientById(Long ClientId);

    List<Client> getAllClients();

    Client changePassword(Long ClientId, String newPassword);
}
