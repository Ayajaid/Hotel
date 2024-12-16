package ma.project.gestion_hotel.controllers;
import io.grpc.stub.StreamObserver;
import stubs.ReservationServiceGrpc;
import stubs.*;
import stubs.Reservation;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    // Stockage simulé en mémoire (base de données fictive)
    private final ConcurrentHashMap<String, Reservation> reservationStore = new ConcurrentHashMap<>();
    private final Map<String, Reservation> reservationDB = new HashMap<>();

    // Récupérer toutes les réservations
    @Override
    public void getAllReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        List<Reservation> reservations = new ArrayList<>(reservationStore.values());

        GetAllReservationsResponse response = GetAllReservationsResponse.newBuilder()
                .addAllReservations(reservations)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Récupérer une réservation par ID
    @Override
    public void getReservationById(GetReservationByIdRequest request, StreamObserver<GetReservationByIdResponse> responseObserver) {
        String reservationId = request.getId();
        Reservation reservation = reservationStore.get(reservationId);

        if (reservation != null) {
            GetReservationByIdResponse response = GetReservationByIdResponse.newBuilder()
                    .setReservation(reservation)
                    .build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new Exception("Réservation non trouvée pour ID : " + reservationId));
        }
        responseObserver.onCompleted();
    }

    // Sauvegarder une réservation (création ou mise à jour)
    @Override
    public void createReservation(CreateReservationRequest request, StreamObserver<CreateReservationResponse> responseObserver) {
        // Récupérer les données de la requête
        Reservation reservationReq = request.getReservation();
        String id = UUID.randomUUID().toString(); // Générer un identifiant unique pour la réservation

        // Construire l'objet Reservation
        Reservation reservation = Reservation.newBuilder()
                .setId(id)
                .setClientId(reservationReq.getClientId()) // Client de la requête
                .setChambreId(reservationReq.getChambreId()) // Chambre de la requête
                .setDateDebut(reservationReq.getDateDebut()) // Date de début
                .setDateFin(reservationReq.getDateFin()) // Date de fin
                .setPreferences(reservationReq.getPreferences()) // Préférences
                .build();

        // Sauvegarder la réservation dans la base de données (simulée ici par une map)
        reservationDB.put(id, reservation); // Assurez-vous que reservationDB est une HashMap<String, Reservation>

        // Construire la réponse et l'envoyer au client
        CreateReservationResponse response = CreateReservationResponse.newBuilder()
                .setReservation(reservation)
                .build();

        responseObserver.onNext(response); // Envoyer la réponse
        responseObserver.onCompleted(); // Compléter l'appel
    }


    // Supprimer une réservation par ID
    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        String reservationId = request.getId();
        boolean success = reservationStore.remove(reservationId) != null;

        DeleteReservationResponse response = DeleteReservationResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
