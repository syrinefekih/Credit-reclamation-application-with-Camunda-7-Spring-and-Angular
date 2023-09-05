package com.example.reclamationDemandeCredit.Repository;

import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import com.example.reclamationDemandeCredit.Entity.Etape;
import com.example.reclamationDemandeCredit.Entity.ScenarioEtape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
@Repository

public interface EtapeRepository extends JpaRepository<Etape,String> {

}
