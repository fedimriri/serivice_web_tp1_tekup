package org.soap.soap_provider.webservice;

import jakarta.jws.*;
import jakarta.jws.*;
import org.soap.soap_provider.models.Produit;
import java.util.*;

@WebService(name = "ProduitWS")
public class ProduitWebService {


    @WebMethod(operationName = "getProduit")
    public Produit getProduit(@WebParam(name = "Produit") Integer code) {
        Produit produit = new Produit(code, "PC", 1000.0, new Date());
        return produit;
    }


    @WebMethod
    public List<Produit> listeProduits(){
        return List.of(
                new Produit(1, "PC", 1000.0, new Date()),
                new Produit(2, "Tablette", 800.0, new Date()),
                new Produit(3, "Souris", 30.0, new Date())
        );
    }
}
