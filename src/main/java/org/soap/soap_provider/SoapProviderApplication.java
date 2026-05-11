package org.soap.soap_provider;

import org.soap.soap_provider.server.ServerWS;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapProviderApplication.class, args);
    }

    @Bean
    CommandLineRunner startSoap() {
        return args -> {
            ServerWS.start();
        };
    }

}
