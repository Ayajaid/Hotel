package ma.project.gestion_hotel.repositories;



import ma.project.gestion_hotel.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
