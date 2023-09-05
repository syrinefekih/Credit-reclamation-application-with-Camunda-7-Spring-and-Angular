package com.example.reclamationDemandeCredit.Entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Component

@Table(name = "profil_utilisateur")
public class ProfilUtilisateur {
    @Id
    private String matricule;
    public String password;
    @ManyToOne
    @JoinColumn(name = "id_profil")
    private Utilisateur role;

    public Utilisateur getRole() {
        return role;
    }

    public void setRole(Utilisateur role) {
        this.role = role;
    }

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getMatricule() {return matricule;
    }
    public void setMatricule(String matricule) {this.matricule = matricule;
    }
}
