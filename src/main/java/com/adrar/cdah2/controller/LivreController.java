package com.adrar.cdah2.controller;

import com.adrar.cdah2.model.Livre;
import com.adrar.cdah2.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LivreController {

    @Autowired
    private LivreService livreService;

    // Méthode qui retourne tous les objets Livre
    @GetMapping("/livres")
    public Iterable<Livre> getAllLivres() {
        return livreService.getAll();
    }
}
