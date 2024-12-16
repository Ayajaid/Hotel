package ma.project.gestion_hotel.repositories;



import ma.project.gestion_hotel.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

