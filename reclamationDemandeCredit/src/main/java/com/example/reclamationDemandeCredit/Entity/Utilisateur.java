package com.example.reclamationDemandeCredit.Entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Component

@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    private String idProfil;

    private String libelé;

    public String getLibelé() {
        return libelé;
    }

    public void setLibelé(String libelé) {
        this.libelé = libelé;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public String getIdProfil() {
        return idProfil;
    }


}
