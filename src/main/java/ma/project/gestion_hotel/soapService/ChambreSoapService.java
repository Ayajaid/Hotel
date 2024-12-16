package ma.project.gestion_hotel.soapService;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import ma.project.gestion_hotel.entities.Chambre;
import ma.project.gestion_hotel.entities.TypeChambre;
import ma.project.gestion_hotel.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@WebService(serviceName = "ChambreWS")
@Component
public class ChambreSoapService {

    @Autowired
    private ChambreRepository chambreRepository;

    @WebMethod
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @WebMethod
    public Chambre getChambreById(Long id) {
        Optional<Chambre> chambre = chambreRepository.findById(id);
        return chambre.orElse(null);
    }

    @WebMethod
    public Chambre createChambre(String type, double prix, boolean disponible) {
        Chambre chambre = new Chambre();
        chambre.setType(TypeChambre.valueOf(type));
        chambre.setPrix(prix);
        chambre.setDisponible(disponible);
        return chambreRepository.save(chambre);
    }

    @WebMethod
    public boolean deleteChambre(Long id) {
        if (chambreRepository.existsById(id)) {
            chambreRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Chambre editChambre(@WebParam(name = "id") Long id,
                               @WebParam(name = "type") String type,
                               @WebParam(name = "prix") double prix,
                               @WebParam(name = "disponible") boolean disponible) {
        Chambre chambre = chambreRepository.findById(id).orElse(null);
        if (chambre == null) {
            return null; // Chambre non trouvée
        }

        chambre.setType(TypeChambre.valueOf(type));
        chambre.setPrix(prix);
        chambre.setDisponible(disponible);

        return chambreRepository.save(chambre);
    }
}
