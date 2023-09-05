package com.example.reclamationDemandeCredit.Repository;

import com.example.reclamationDemandeCredit.Entity.ProfilUtilisateur;
import com.example.reclamationDemandeCredit.Entity.Utilisateur;
import org.springframework.beans.PropertyValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UsersRepository extends JpaRepository<ProfilUtilisateur,String> {
    @Query("SELECT u FROM ProfilUtilisateur u WHERE u.matricule = :username")
    public ProfilUtilisateur getUserByMatricule(@Param("username") String username);
}
