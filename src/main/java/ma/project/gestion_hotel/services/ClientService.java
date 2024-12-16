package  ma.project.gestion_hotel.services;


import ma.project.gestion_hotel.entities.Client;
import ma.project.gestion_hotel.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public boolean deleteClient(Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Client updateClient(Long id, Client updatedClient) {
        return clientRepository.findById(id).map(existingClient -> {
            existingClient.setNom(updatedClient.getNom());
            existingClient.setPrenom(updatedClient.getPrenom());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setTelephone(updatedClient.getTelephone());
            return clientRepository.save(existingClient);
        }).orElse(null);
    }
}
