package com.example.reclamationDemandeCredit.Service;

import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import com.example.reclamationDemandeCredit.Repository.DemandeCreditRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DemandeService {
    @Autowired
    DemandeCreditRepository demandeCreditRepository;
    protected static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DemandeService.class);

    public int saveOrUpdateDemandeCredit(DemandeCredit demandeCredit) throws IOException {
        demandeCreditRepository.save(demandeCredit);
        int id= demandeCredit.getIdDemandeCredit();
        LOGGER.info(String.valueOf(id));
        //runtimeService.startProcessInstanceByKey("processes_reclam-credit", String.valueOf(id));
        return id;
    }


    public boolean deleteDemandeCredit(int idDemandeCredit) {
        demandeCreditRepository.deleteById(String.valueOf(idDemandeCredit));
        return false;
    }

    public Optional<DemandeCredit> getDemandeCreditByID(String id) throws IOException {
        return demandeCreditRepository.findById(id);
    }

    public List<DemandeCredit> allDemandes() {
        return demandeCreditRepository.findAll();
    }
public  List<DemandeCredit> demandeByEtape(String id){
        return demandeCreditRepository.getDeamndeByIdEtape(id);
}
}
