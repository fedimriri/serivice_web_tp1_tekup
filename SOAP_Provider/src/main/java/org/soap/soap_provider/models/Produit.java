package org.soap.soap_provider.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@XmlRootElement(name= "produit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Produit {

    //private int id;
    private Integer code;
    private String nom;
    private Double prix;
    @XmlTransient
    private Date dateCreation;


    public Produit(Integer code, String nom, Double prix, Date dateCreation) {
        this.code = code;
        this.nom = nom;
        this.prix = prix;
        this.dateCreation = dateCreation;
    }
}