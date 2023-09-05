package com.example.reclamationDemandeCredit.Controller;

import com.example.reclamationDemandeCredit.Entity.Client;
import com.example.reclamationDemandeCredit.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<String> allClient() throws IOException {
        return clientService.getAll();
    }

    @GetMapping("/{idClient}")
    public Optional<Client> clientById(@PathVariable("idClient") String clientId) throws IOException {
        return clientService.getClientByID(clientId);
    }

    @GetMapping("/cin/{cin}")
    public Client clientByCin(@PathVariable("cin") String cin) throws IOException {
        return this.clientService.getClientByCin(cin);
    }

    @PostMapping("/save-client")
    public boolean saveDemandeCredit(@RequestBody Client client) throws IOException {
        return clientService.saveOrUpdateClient(client);
    }

    @DeleteMapping("/delete-client/{clientId}")
    public boolean deleteDemandeCredit(@PathVariable("clientId") String clientId,Client client) {
        client.setIdClient(clientId);
        return clientService.deleteClient(client);
    }

    @PostMapping("update-client/{clientId}")
    public boolean updateStudent(@RequestBody Client client,@PathVariable("clientId") String clientId) throws IOException {
        client.setIdClient(clientId);
        return clientService.saveOrUpdateClient(client);
    }
}
