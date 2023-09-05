package com.example.reclamationDemandeCredit.Service;

import com.example.reclamationDemandeCredit.Entity.Etape;
import com.example.reclamationDemandeCredit.Repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitionService {
@Autowired
        ScenarioRepository scenarioRepository;
        public List<Etape> getEtapeSuivante(String idEtape) {
            return scenarioRepository.getEtapeSuivantes(idEtape);
        }

    }
