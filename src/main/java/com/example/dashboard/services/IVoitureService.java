package com.example.dashboard.services;

import com.example.dashboard.entity.Voiture;

import java.util.List;
import java.util.Optional;

public interface IVoitureService {
    List<Voiture> getAllVoitures();  // Récupérer toutes les voitures

    Voiture saveVoiture(Voiture voiture);  // Ajouter une voiture

    Voiture updateVoiture(Voiture voiture);  // Mettre à jour une voiture²

    Optional<Voiture> getVoitureById(String idVoiture);  // Récupérer une voiture par ID

    void deleteVoiture(String idVoiture);  // Supprimer une voiture par ID
}
