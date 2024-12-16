package ma.project.gestion_hotel.repositories;


import ma.project.gestion_hotel.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
