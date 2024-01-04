package com.javaprojects.nexpin.service.impl;

import com.javaprojects.nexpin.model.entity.Client;
import com.javaprojects.nexpin.repository.ClientRepository;
import com.javaprojects.nexpin.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    @Override
    public Client registerNewClient(Client client) {
        return null;
    }

    @Override
    public Client updateClientDetails(Long ClientId, Client client) {
        return null;
    }

    @Override
    public void deleteClient(Long ClientId) {

    }

    @Override
    public Client getClientById(Long ClientId) {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public Client changePassword(Long ClientId, String newPassword) {
        return null;
    }
}
