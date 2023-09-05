package com.example.reclamationDemandeCredit.Controller;

import com.example.reclamationDemandeCredit.Entity.ProfilUtilisateur;
import com.example.reclamationDemandeCredit.Entity.Utilisateur;
import com.example.reclamationDemandeCredit.Service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.Principal;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UsersController {

    @RequestMapping("/login")
    public boolean login(@RequestBody ProfilUtilisateur user) {
        return
                user.getMatricule().equals("user") && user.getPassword().equals("password");
    }

    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }
}
