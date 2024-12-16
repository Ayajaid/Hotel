package ma.project.gestion_hotel.soapService;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import ma.project.gestion_hotel.entities.Chambre;
import ma.project.gestion_hotel.entities.Client;
import ma.project.gestion_hotel.entities.Reservation;
import ma.project.gestion_hotel.repositories.ChambreRepository;
import ma.project.gestion_hotel.repositories.ClientRepository;
import ma.project.gestion_hotel.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebService(serviceName = "ReservationWS")
@Component
public class ReservationSoapService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Reservation createReservation(@WebParam(name = "clientId") Long clientId,
                                         @WebParam(name = "chambreId") Long chambreId,
                                         @WebParam(name = "dateDebut") String dateDebut,
                                         @WebParam(name = "dateFin") String dateFin,
                                         @WebParam(name = "preferences") String preferences) {
        // Vérifier l'existence du Client et de la Chambre
        Client client = clientRepository.findById(clientId).orElse(null);
        Chambre chambre = chambreRepository.findById(chambreId).orElse(null);

        if (client == null || chambre == null) {
            return null; // Client ou chambre non trouvé
        }

        // Conversion des chaînes de date en objets Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date debut = null;
        Date fin = null;
        try {
            debut = dateFormat.parse(dateDebut);
            fin = dateFormat.parse(dateFin);
        } catch (ParseException e) {
            e.printStackTrace();  // Log l'erreur
            return null;  // Si la conversion échoue, retournez null
        }

        // Créer la réservation
        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(debut);
        reservation.setDateFin(fin);
        reservation.setPreferences(preferences);

        return reservationRepository.save(reservation);  // Sauvegarder la réservation
    }

    @WebMethod
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Reservation editReservation(@WebParam(name = "id") Long id,
                                       @WebParam(name = "clientId") Long clientId,
                                       @WebParam(name = "chambreId") Long chambreId,
                                       @WebParam(name = "dateDebut") String dateDebut,
                                       @WebParam(name = "dateFin") String dateFin,
                                       @WebParam(name = "preferences") String preferences) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation == null) {
            return null; // La réservation n'existe pas
        }

        Client client = clientRepository.findById(clientId).orElse(null);
        Chambre chambre = chambreRepository.findById(chambreId).orElse(null);
        if (client == null || chambre == null) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(dateFormat.parse(dateDebut));
            reservation.setDateFin(dateFormat.parse(dateFin));
            reservation.setPreferences(preferences);

            return reservationRepository.save(reservation);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
