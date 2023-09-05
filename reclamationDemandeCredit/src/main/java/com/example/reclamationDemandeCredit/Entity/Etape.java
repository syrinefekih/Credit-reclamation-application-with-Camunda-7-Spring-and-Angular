package com.example.reclamationDemandeCredit.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Component

@Table(name = "etape")
public class Etape {

    @Id
    @JsonProperty("idEtape")
    private String idEtape;

    private String description;
    private int finProcess;
    private int annulation;
    @ManyToOne
    @JoinColumn(name = "id_profil")
    private ProfilUtilisateur profil;
    public String getIdEtape() {
        return idEtape;
    }


    public void setIdEtape(String idEtape) {
        this.idEtape = idEtape;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFinProcess() {
        return finProcess;
    }

    public void setFinProcess(int finProcess) {
        this.finProcess = finProcess;
    }

    public int getAnnulation() {
        return annulation;
    }

    public void setAnnulation(int annulation) {
        this.annulation = annulation;
    }
}

/*
//@Document(indexName = "etape")

 */
