package com.example.dashboard.controllers;

import com.example.dashboard.entity.Voiture;
import com.example.dashboard.services.VoitureServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/voitures")  // Prefixe pour les endpoints des voitures
public class VoitureController {

    private final VoitureServiceImp voitureService;

    public VoitureController(VoitureServiceImp voitureService) {
        this.voitureService = voitureService;
    }

    // Récupérer toutes les voitures
    @GetMapping
    public List<Voiture> getAllVoitures() {
        return voitureService.getAllVoitures();
    }

    // Récupérer une voiture par ID
    @GetMapping("/{idVoiture}")
    public Optional<Voiture> getVoitureById(@PathVariable String idVoiture) {
        return voitureService.getVoitureById(idVoiture);
    }

    // Enregistrer une voiture
    @PostMapping
    public Voiture createVoiture(@RequestBody Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }

    // Supprimer une voiture par ID
    @DeleteMapping("/{idVoiture}")
    public void deleteVoiture(@PathVariable String idVoiture) {
        voitureService.deleteVoiture(idVoiture);
    }
}
