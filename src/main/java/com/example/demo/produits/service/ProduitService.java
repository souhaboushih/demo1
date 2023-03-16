package com.example.demo.produits.service;

import com.example.demo.produits.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
