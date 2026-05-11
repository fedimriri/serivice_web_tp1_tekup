package org.soap.soap_provider.models;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
public class Produit {

    private int id;
    private Integer code;
    private String nom;
    private Double prix;
    private Date dateCreation;


    public Produit(Integer code, String nom, Double prix, Date dateCreation) {
        this.code = code;
        this.nom = nom;
        this.prix = prix;
        this.dateCreation = dateCreation;
    }
}