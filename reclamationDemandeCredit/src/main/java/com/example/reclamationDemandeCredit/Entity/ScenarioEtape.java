package com.example.reclamationDemandeCredit.Entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "scenario_etape")
public class ScenarioEtape {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idScenario;
    private String libelé;

    public String getLibelé() {
        return libelé;
    }

    public void setLibelé(String libelé) {
        this.libelé = libelé;
    }

    public Etape getEtapeDebut() {
        return etapeDebut;
    }

    public void setEtapeDebut(Etape etapeDebut) {
        this.etapeDebut = etapeDebut;
    }

    public Etape getEtapeArrivee() {
        return etapeArrivee;
    }

    public void setEtapeArrivee(Etape etapeArrivee) {
        this.etapeArrivee = etapeArrivee;
    }

    @ManyToOne
    @JoinColumn(name = "id_etape_debut")
    private Etape etapeDebut;

    @ManyToOne
    @JoinColumn(name = "id_etape_arrivee")
    private Etape etapeArrivee;
    public void setIdScenario(String idScenario) {
        this.idScenario = idScenario;
    }

    public String getIdScenario() {
        return idScenario;
    }
}
