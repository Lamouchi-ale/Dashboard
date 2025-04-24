package com.example.dashboard.repository;

import com.example.dashboard.entity.canframe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface canframeRepo extends MongoRepository<canframe, String> {
    List<canframe> findByVoitureId(String voitureId);  // Requête personnalisée pour récupérer par voitureId
}
