package com.example.dashboard.services;

import com.example.dashboard.entity.Voiture;
import com.example.dashboard.repository.VoitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoitureServiceImp implements IVoitureService {

    private final VoitureRepository voitureRepository;

    // Constructeur avec injection de dépendances
    public VoitureServiceImp(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    // Récupérer toutes les voitures
    @Override
    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    // Ajouter une voiture
    @Override
    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    // Mettre à jour une voiture
    @Override
    public Voiture updateVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    // Récupérer une voiture par ID
    @Override
    public Optional<Voiture> getVoitureById(String id) {
        return voitureRepository.findById(id);
    }

    // Supprimer une voiture par ID
    @Override
    public void deleteVoiture(String id) {
        voitureRepository.deleteById(id);
    }
}
