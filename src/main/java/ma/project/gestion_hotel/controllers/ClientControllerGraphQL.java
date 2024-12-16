package ma.project.gestion_hotel.controllers;



import ma.project.gestion_hotel.entities.Client;
import ma.project.gestion_hotel.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientControllerGraphQL {

    @Autowired
    private ClientRepository clientRepository;

    // Créer un client
    @MutationMapping
    public Client createClient(@Argument String nom,
                               @Argument String prenom,
                               @Argument String email,
                               @Argument String telephone) {
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);

        return clientRepository.save(client);
    }

    // Mettre à jour un client
    @MutationMapping
    public Client updateClient(@Argument Long id,
                               @Argument String nom,
                               @Argument String prenom,
                               @Argument String email,
                               @Argument String telephone) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client non trouvé"));

        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);

        return clientRepository.save(client);
    }

    // Supprimer un client
    @MutationMapping
    public String deleteClient(@Argument Long id) {
        clientRepository.deleteById(id);
        return "Client supprimé avec succès";
    }

    // Récupérer un client par ID
    @QueryMapping
    public Client getClientById(@Argument Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client non trouvé"));
    }

    // Récupérer tous les clients
    @QueryMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
