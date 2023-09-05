package com.example.reclamationDemandeCredit.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import org.springframework.stereotype.Component;

import java.util.Date;
@Entity
@Component
@Table(name = "demande_credit")
public class DemandeCredit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDemandeCredit;
    private Double montant;
    private String typeCredit;

    private String motifReclamation;
    private String motifTransition;
    private String nomCreateur;
    private String nomModifieur;

    private Date dateCreation = new Date();
    private  Date dateModification;
    private String canal;

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Date getDateCreation() {
        return dateCreation;
    }


    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_etape")
    private Etape etape;


    public String getTypeCredit() {
        return typeCredit;
    }

    public void setTypeCredit(String typeCredit) {
        this.typeCredit = typeCredit;
    }

    public String getMotifReclamation() {
        return motifReclamation;
    }

    public void setMotifReclamation(String motifReclamation) {
        this.motifReclamation = motifReclamation;
    }

    public String getMotifTransition() {
        return motifTransition;
    }

    public void setMotifTransition(String motifTransition) {
        this.motifTransition = motifTransition;
    }

    public String getNomCreateur() {
        return nomCreateur;
    }

    public void setNomCreateur(String nomCreateur) {
        this.nomCreateur = nomCreateur;
    }

    public String getNomModifieur() {
        return nomModifieur;
    }

    public void setNomModifieur(String nomModifieur) {
        this.nomModifieur = nomModifieur;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Etape getEtape() {
        return etape;
    }

    public void setEtape(Etape etape) {
        this.etape = etape;
    }


    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }



    public void setIdDemandeCredit(int idDemandeCredit) {
        this.idDemandeCredit = idDemandeCredit;
    }

    public int getIdDemandeCredit() {
        return idDemandeCredit;
    }
}
/*
//@Document(indexName = "demandeCredit")
    @Field(type = FieldType.Text, name = "typeCredit")
    @Field(type = FieldType.Text, name = "statut")
    @Field(type = FieldType.Date, name = "date")
    @Field(type = FieldType.Double, name = "montant")
    @Field(type = FieldType.Double, name = "tauxInteret")

    @Field(type = FieldType.Double, name = "dureeRemboursement")

 */