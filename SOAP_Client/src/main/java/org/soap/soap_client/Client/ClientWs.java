package org.soap.soap_client.Client;

import proxy.ProduitWS;
import proxy.ProduitWebServiceService;

public class ClientWs {
    public static void main(String[] args){
        ProduitWS proxy = new ProduitWebServiceService().getProduitWSPort();
        System.out.println(proxy.getProduit(1).getPrix());
    }
}
