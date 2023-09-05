package com.example.reclamationDemandeCredit.Service;

import com.example.reclamationDemandeCredit.Entity.ProfilUtilisateur;
import com.example.reclamationDemandeCredit.Entity.Utilisateur;
import com.example.reclamationDemandeCredit.Repository.UsersRepository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl{
    UsersRepository usersRepository;
    /*@Override
    public boolean saveOrUpdateUser(ProfilUtilisateur user) throws IOException {
        usersRepository.save(user);
        return false;
    }

    @Override
    public List<ProfilUtilisateur> getUsers() {
       return usersRepository.findAll();
    }

    @Override
    public void deleteUser(ProfilUtilisateur user) {
        usersRepository.delete(user);
    }

    @Override
    public Optional getUserByID(String id) {
        return usersRepository.findById(id);
    }*/

}
