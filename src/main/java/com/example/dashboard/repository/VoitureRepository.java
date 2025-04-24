package com.example.dashboard.repository;

import com.example.dashboard.entity.Voiture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends MongoRepository<Voiture, String> {
    // Tu peux ajouter des méthodes personnalisées si nécessaire
}
