package com.example.reclamationDemandeCredit.Controller;

import com.example.reclamationDemandeCredit.Entity.DemandeCredit;
import com.example.reclamationDemandeCredit.Service.DemandeService;
import jakarta.validation.constraints.Null;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/credit-reclamations")
public class CreditReclamationController {
    private DemandeService demandeService;


    @GetMapping("/all")
    public List<DemandeCredit> getAllCreditReclamations() {
        return demandeService.allDemandes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DemandeCredit> getCreditReclamationById(@PathVariable Long id) throws IOException {
        DemandeCredit reclamation = demandeService.getDemandeCreditByID(String.valueOf(id)).orElse(null);
        if (reclamation != null) {
            return ResponseEntity.ok(reclamation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Integer> createCreditReclamation(@RequestBody DemandeCredit reclamation) throws IOException {
        int savedReclamation = demandeService.saveOrUpdateDemandeCredit(reclamation);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedReclamation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DemandeCredit> updateCreditReclamation(
            @PathVariable Long id, @RequestBody DemandeCredit updatedReclamation) throws IOException {
        DemandeCredit reclamation = demandeService.getDemandeCreditByID(String.valueOf(id)).orElse(null);
        return ResponseEntity.ok(reclamation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCreditReclamation(@PathVariable Long id) throws IOException {
        DemandeCredit reclamation = demandeService.getDemandeCreditByID(String.valueOf(id)).orElse(null);
        if (reclamation != null) {
            demandeService.deleteDemandeCredit(reclamation.getIdDemandeCredit());
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}