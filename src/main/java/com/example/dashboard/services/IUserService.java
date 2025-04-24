package com.example.dashboard.services;

import com.example.dashboard.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    // Récupérer tous les utilisateurs
    List<User> getAllUsers();

    // Récupérer un utilisateur par son ID
    Optional<User> getUserById(String id);

    // Enregistrer un utilisateur
    User saveUser(User user);

    // Supprimer un utilisateur par ID
    void deleteUser(String id);

    // Rechercher un utilisateur par email
    Optional<User> getUserByEmail(String email);
}
