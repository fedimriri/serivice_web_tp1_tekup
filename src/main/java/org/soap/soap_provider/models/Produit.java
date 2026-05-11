package org.soap.soap_provider.models;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    private Integer code;
    private String nom;
    private Double prix;
    private Date dateCreation;
}