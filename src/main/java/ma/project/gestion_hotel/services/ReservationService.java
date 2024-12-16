package ma.project.gestion_hotel.services;



import ma.project.gestion_hotel.entities.Reservation;
import ma.project.gestion_hotel.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public boolean deleteReservation(Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
    // Mettre à jour une réservation existante
    public Reservation updateReservation(Long id, Reservation updatedReservation) {
        return reservationRepository.findById(id).map(existingReservation -> {
            // Mettre à jour les champs nécessaires
            existingReservation.setClient(updatedReservation.getClient());
            existingReservation.setChambre(updatedReservation.getChambre());
            existingReservation.setDateDebut(updatedReservation.getDateDebut());
            existingReservation.setDateFin(updatedReservation.getDateFin());
            existingReservation.setPreferences(updatedReservation.getPreferences());

            return reservationRepository.save(existingReservation); // Sauvegarder les modifications
        }).orElse(null); // Retourne null si la réservation n'existe pas
    }
}
