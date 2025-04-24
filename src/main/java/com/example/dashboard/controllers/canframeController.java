package com.example.dashboard.controllers;

import com.example.dashboard.entity.canframe;
import com.example.dashboard.services.canframeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/canframes")  // URL de base pour accéder aux endpoints
@CrossOrigin(origins = "*")  // Autorise les requêtes de tous les domaines (CORS)
public class canframeController {

    private final canframeService canFrameService;

    public canframeController(canframeService canFrameService) {
        this.canFrameService = canFrameService;
    }

    // ✅ Récupérer tous les enregistrements
    @GetMapping
    public List<canframe> getAllCanFrames() {
        return canFrameService.getAllCanframes();
    }

    @GetMapping("/{id}")
    public Optional<canframe> getCanFrameById(@PathVariable String id) {
        return canFrameService.getCanframeById(id);  // ✅ Passe 'id' à la méthode
    }


    // ✅ Récupérer les trames CAN par voitureId
    @GetMapping("/voiture/{voitureId}")
    public List<canframe> getCanFramesByVoitureId(@PathVariable String voitureId) {
        return canFrameService.getCanframesByVoitureId(voitureId);  // ✅ Passe 'voitureId' à la méthode
    }



    @PostMapping
    public canframe createCanFrame(@RequestBody canframe canframe) {
        return canFrameService.saveCanframe(canframe);
    }

    // ✅ Supprimer un enregistrement par ID
    @DeleteMapping("/{id}")
    public void deleteCanFrame(@PathVariable String id) {
        canFrameService.deleteCanframe(id);
    }
}
