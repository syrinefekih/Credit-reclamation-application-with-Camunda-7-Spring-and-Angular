package com.example.reclamationDemandeCredit.Controller;

import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import com.example.reclamationDemandeCredit.Service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/demandesCredit")
public class DemandeCreditController {

    @Autowired
    private DemandeService demandeService;

    @PostMapping("save-demandeCredit")
    public int saveDemandeCredit(@RequestBody DemandeCredit demandeCredit) throws IOException {
        return demandeService.saveOrUpdateDemandeCredit(demandeCredit);
    }

    @GetMapping("/all")
    public List<DemandeCredit> getDemandes(){
        return demandeService.allDemandes();
    }

    @GetMapping("all/{id}")
    public List<DemandeCredit> getDemandeByEtape(@PathVariable("demandeId") String id){
        return demandeService.demandeByEtape(id);
    }

    @DeleteMapping("delete-demandeCredit/{demandeId}")
    public boolean deleteDemandeCredit(@PathVariable("demandeId") int demandeId,DemandeCredit demandeCredit) throws IOException {
        //demandeCredit.setIdDemande(demandeId);
        return demandeService.deleteDemandeCredit(demandeId);
    }

    @GetMapping("/{demandeId}")
    public Optional<DemandeCredit> demandeByID(@PathVariable("demandeId") String demandeId, DemandeCredit demandeCredit) throws IOException {
        return demandeService.getDemandeCreditByID(demandeId);
    }

    @PostMapping("/update-demande")
    public int updateReclamation(@RequestBody DemandeCredit demandeCredit) throws IOException {
        return demandeService.saveOrUpdateDemandeCredit(demandeCredit);
    }
}
