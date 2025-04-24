package com.example.dashboard.services;

import com.example.dashboard.entity.User;
import com.example.dashboard.entity.canframe;
import com.example.dashboard.repository.canframeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class canframeService implements ICanframeService {

    private final canframeRepo canFrameRepository;

    public canframeService(canframeRepo canFrameRepository) {
        this.canFrameRepository = canFrameRepository;
    }

    @Override
    public List<canframe> getAllCanframes() {
        return canFrameRepository.findAll();
    }

    @Override
    public Optional<canframe> getCanframeById(String id) {
        return canFrameRepository.findById(id);
    }


   @Override
    public List<canframe> getCanframesByVoitureId(String voitureId) {
        return canFrameRepository.findByVoitureId(voitureId);
    }
    @Override
    public canframe saveCanframe(canframe canframe) {
        return canFrameRepository.save(canframe);
    }


    @Override
    public void deleteCanframe(String id) {
        canFrameRepository.deleteById(id);
    }
}
