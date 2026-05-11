package org.soap.soap_provider.server;

import jakarta.xml.ws.Endpoint;
import org.soap.soap_provider.webservice.ProduitWebService;

public class ServerWS {
    public static void start() {
        String url = "http://127.0.0.1:8090/";
        Endpoint.publish(url, new ProduitWebService());
        System.out.println( url + "deployed" );
    }
}
