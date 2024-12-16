package ma.project.gestion_hotel.soapService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import ma.project.gestion_hotel.entities.Client;
import ma.project.gestion_hotel.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@WebService(serviceName = "ClientWS")
@Component
public class ClientSoapService {

    @Autowired
    private ClientRepository clientRepository;

    @WebMethod
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @WebMethod
    public Client getClientById(@WebParam(name = "id") Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Client createClient(@WebParam(name = "nom") String nom,
                               @WebParam(name = "prenom") String prenom,
                               @WebParam(name = "email") String email,
                               @WebParam(name = "telephone") String telephone) {
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);
        return clientRepository.save(client);
    }

    @WebMethod
    public boolean deleteClient(@WebParam(name = "id") Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Client editClient(@WebParam(name = "id") Long id,
                             @WebParam(name = "nom") String nom,
                             @WebParam(name = "prenom") String prenom,
                             @WebParam(name = "email") String email,
                             @WebParam(name = "telephone") String telephone) {
        Client client = clientRepository.findById(id).orElse(null);
        if (client == null) {
            return null; // Client non trouvé
        }

        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);

        return clientRepository.save(client);
    }
}

