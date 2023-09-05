package com.example.reclamationDemandeCredit.Repository;

import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import com.example.reclamationDemandeCredit.Entity.ProfilUtilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface DemandeCreditRepository extends JpaRepository<DemandeCredit,String> {
    @Query("SELECT d FROM DemandeCredit d WHERE d.etape.idEtape = :idEtape")
    public List<DemandeCredit> getDeamndeByIdEtape(@Param("idEtape") String idEtape);
}
