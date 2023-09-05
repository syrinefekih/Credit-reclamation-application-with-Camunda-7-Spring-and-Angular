package com.example.reclamationDemandeCredit.Service;

import com.example.reclamationDemandeCredit.Entity.Client;
import com.example.reclamationDemandeCredit.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService{
    @Autowired
    ClientRepository clientRepository;
    public boolean saveOrUpdateClient(Client client) throws IOException {
         clientRepository.save(client);
        return false;
    }

    public boolean deleteClient(Client client) {
         clientRepository.delete(client);
        return false;
    }


    public Optional<Client> getClientByID(String id) throws IOException {
        return clientRepository.findById(id);
    }
    public Client getClientByCin(String cin) throws IOException{
        return clientRepository.getClientByCin(cin);
    }


    public List<String> getAll() throws IOException {
       // return clientRepository.findAll();
            List<Client> entities = clientRepository.findAll();
            return entities.stream()
                    .map(Client::getIdClient)
                    .collect(Collectors.toList());
        }
    }