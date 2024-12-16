package ma.project.gestion_hotel.services;




import ma.project.gestion_hotel.entities.Chambre;
import ma.project.gestion_hotel.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    /**
     * Récupérer toutes les chambres.
     */
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    /**
     * Récupérer une chambre par son identifiant.
     */
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    /**
     * Créer une nouvelle chambre.
     */
    public Chambre createChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    /**
     * Mettre à jour une chambre existante.
     */
    public Chambre updateChambre(Long id, Chambre updatedChambre) {
        Optional<Chambre> optionalChambre = chambreRepository.findById(id);

        if (optionalChambre.isPresent()) {
            Chambre existingChambre = optionalChambre.get();
            existingChambre.setPrix(updatedChambre.getPrix());
            existingChambre.setType(updatedChambre.getType());
            return chambreRepository.save(existingChambre);
        }
        return null; // Retourner null si la chambre n'existe pas
    }

    /**
     * Supprimer une chambre par son identifiant.
     */
    public boolean deleteChambre(Long id) {
        if (chambreRepository.existsById(id)) {
            chambreRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
