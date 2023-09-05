package com.example.reclamationDemandeCredit.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

//@Document(indexName = "client")
@Entity
@Component
@Table(name="client")
public class Client {

    @Id
    private String idClient;
    private String nom;
    private String prenom;
    private String cin;
    private String profession;
    private String revenu;
    private double numeroTelephone;

    public double getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(double numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getRevenu() {
        return revenu;
    }

    public void setRevenu(String revenu) {
        this.revenu = revenu;
    }
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}