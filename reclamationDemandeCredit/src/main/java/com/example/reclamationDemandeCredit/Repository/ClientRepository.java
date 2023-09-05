package com.example.reclamationDemandeCredit.Repository;

import com.example.reclamationDemandeCredit.Entity.Client;
import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {
    @Query("SELECT c FROM Client c WHERE c.cin = :cin")
    public Client getClientByCin(@Param("cin") String cin);
}
