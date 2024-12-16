package ma.project.gestion_hotel.controllers;



import ma.project.gestion_hotel.entities.Chambre;
import ma.project.gestion_hotel.entities.TypeChambre;
import ma.project.gestion_hotel.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ChambreControllerGraphQL {

    @Autowired
    private ChambreRepository chambreRepository;

    // Créer une chambre
    @MutationMapping
    public Chambre createChambre(@Argument String type,
                                 @Argument Double prix,
                                 @Argument Boolean disponible) {
        Chambre chambre = new Chambre();
        chambre.setType(TypeChambre.valueOf(type));
        chambre.setPrix(prix);
        chambre.setDisponible(disponible);

        return chambreRepository.save(chambre);
    }

    // Mettre à jour une chambre
    @MutationMapping
    public Chambre updateChambre(@Argument Long id,
                                 @Argument String type,
                                 @Argument Double prix,
                                 @Argument Boolean disponible) {
        Chambre chambre = chambreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));

        chambre.setType(TypeChambre.valueOf(type));
        chambre.setPrix(prix);
        chambre.setDisponible(disponible);

        return chambreRepository.save(chambre);
    }

    // Supprimer une chambre
    @MutationMapping
    public String deleteChambre(@Argument Long id) {
        chambreRepository.deleteById(id);
        return "Chambre supprimée avec succès";
    }

    // Récupérer une chambre par ID
    @QueryMapping
    public Chambre getChambreById(@Argument Long id) {
        return chambreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
    }

    // Récupérer toutes les chambres
    @QueryMapping
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }
}
