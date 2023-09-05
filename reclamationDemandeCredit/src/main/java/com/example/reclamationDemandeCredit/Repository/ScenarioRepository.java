package com.example.reclamationDemandeCredit.Repository;

import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import com.example.reclamationDemandeCredit.Entity.Etape;
import com.example.reclamationDemandeCredit.Entity.ScenarioEtape;
import com.example.reclamationDemandeCredit.Entity.TransitionEtape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScenarioRepository extends JpaRepository<ScenarioEtape,String> {
    @Query("SELECT d.etapeArrivee FROM ScenarioEtape d WHERE d.etapeDebut.idEtape = :idEtape")
    List<Etape> getEtapeSuivantes(@Param("idEtape") String idEtape);
}
