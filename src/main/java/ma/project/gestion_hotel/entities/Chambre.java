package ma.project.gestion_hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // La stratégie de génération d'ID (auto-incrémenté en MySQL)
    private Long id;


    @Enumerated(EnumType.STRING)
    private TypeChambre type;
    private double prix;
    private boolean disponible;

}

