package com.example.reclamationDemandeCredit.Entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Entity
@Component

@Table(name = "transition_etape")
public class TransitionEtape {

    @Id
    private String idTransition;
    private String libelé;
    @ManyToOne
    @JoinColumn(name = "id_etape")
    private Etape etapeArrive;

    @ManyToOne
    @JoinColumn(name = "id_scenario")
    private ScenarioEtape scenario;
    public String getIdTransition() {
        return idTransition;
    }

    public void setIdTransition(String idTransition) {
        this.idTransition = idTransition;
    }

    public String getLibelé() {
        return libelé;
    }

    public void setLibelé(String libelé) {
        this.libelé = libelé;
    }

    public Etape getEtapeArrive() {
        return etapeArrive;
    }

    public void setEtapeArrive(Etape etapeArrive) {
        this.etapeArrive = etapeArrive;
    }


    public ScenarioEtape getScenario() {
        return scenario;
    }

    public void setScenario(ScenarioEtape scenario) {
        this.scenario = scenario;
    }


}
