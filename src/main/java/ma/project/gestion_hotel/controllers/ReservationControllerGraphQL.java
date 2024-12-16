package ma.project.gestion_hotel.controllers;

import ma.project.gestion_hotel.entities.Chambre;
import ma.project.gestion_hotel.entities.Client;
import ma.project.gestion_hotel.entities.Reservation;
import ma.project.gestion_hotel.repositories.ChambreRepository;
import ma.project.gestion_hotel.repositories.ClientRepository;
import ma.project.gestion_hotel.repositories.ReservationRepository;
import ma.project.gestion_hotel.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class ReservationControllerGraphQL {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    // Créer une réservation
    @MutationMapping
    public Reservation createReservation(@Argument Long clientId,
                                         @Argument Long chambreId,
                                         @Argument String dateDebut,
                                         @Argument String dateFin,
                                         @Argument String preferences) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client non trouvé"));
        Chambre chambre = chambreRepository.findById(chambreId)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(java.sql.Date.valueOf(dateDebut));
        reservation.setDateFin(java.sql.Date.valueOf(dateFin));
        reservation.setPreferences(preferences);

        return reservationService.createReservation(reservation);
    }

    // Consulter une réservation par ID
    @QueryMapping
    public Reservation getReservationById(@Argument Long id) {
        return reservationService.getReservationById(id);
    }

    // Récupérer toutes les réservations
    @QueryMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // Mettre à jour une réservation
    @MutationMapping
    public Reservation updateReservation(@Argument Long id,
                                         @Argument String dateDebut,
                                         @Argument String dateFin,
                                         @Argument String preferences) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Réservation non trouvée"));

        reservation.setDateDebut(java.sql.Date.valueOf(dateDebut));
        reservation.setDateFin(java.sql.Date.valueOf(dateFin));
        reservation.setPreferences(preferences);

        return reservationRepository.save(reservation);
    }

    // Supprimer une réservation
    @MutationMapping
    public String deleteReservation(@Argument Long id) {
        boolean deleted = reservationService.deleteReservation(id);
        return deleted ? "Réservation supprimée avec succès" : "Erreur lors de la suppression";
    }
}
