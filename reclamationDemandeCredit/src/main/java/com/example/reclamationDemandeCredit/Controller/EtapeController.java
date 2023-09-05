package com.example.reclamationDemandeCredit.Controller;

import com.example.reclamationDemandeCredit.Entity.Etape;
import com.example.reclamationDemandeCredit.Entity.ScenarioEtape;
import com.example.reclamationDemandeCredit.Entity.TransitionEtape;
import com.example.reclamationDemandeCredit.Service.TransitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/etape")
public class EtapeController {
    @Autowired
    private TransitionService transitionService;

    @GetMapping("/{idEtape}")
    public List<Etape> getEtapeSuivantes(@PathVariable String idEtape) {
        return transitionService.getEtapeSuivante(idEtape);
    }

}
