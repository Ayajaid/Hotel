package ma.project.gestion_hotel.controllers;


import ma.project.gestion_hotel.entities.Chambre;
import ma.project.gestion_hotel.services.ChambreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chambres")
public class ChambreController {
    private final ChambreService chambreService;

    public ChambreController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }

    @PostMapping
    public ResponseEntity<Chambre> createChambre(@RequestBody Chambre chambre) {
        return ResponseEntity.ok(chambreService.createChambre(chambre));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambre(@PathVariable Long id) {
        return ResponseEntity.ok(chambreService.getChambreById(id));
    }

    @GetMapping
    public ResponseEntity<List<Chambre>> getAllChambres() {
        return ResponseEntity.ok(chambreService.getAllChambres());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
        return ResponseEntity.noContent().build();
    }
}
