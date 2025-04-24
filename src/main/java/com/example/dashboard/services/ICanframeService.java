package com.example.dashboard.services;

import com.example.dashboard.entity.canframe;

import java.util.List;
import java.util.Optional;

public interface ICanframeService {

    // Récupérer tous les canframes
    List<canframe> getAllCanframes();

    // Récupérer un canframe par son ID
    Optional<canframe> getCanframeById(String id);

    // Récupérer tous les canframes d'une voiture par l'ID de la voiture
    List<canframe> getCanframesByVoitureId(String voitureId);

    // Enregistrer un canframe
    canframe saveCanframe(canframe canframe);

    // Supprimer un canframe par ID
    void deleteCanframe(String id);
}
