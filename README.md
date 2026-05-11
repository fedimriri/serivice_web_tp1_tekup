# Service Web TP1 Tekup

This repository contains a small SOAP web service demo built with Spring Boot.
It is split into two Maven projects:

- `SOAP_Provider`: exposes the SOAP web service
- `SOAP_Client`: consumes the SOAP web service through generated stubs

## Goal

The project demonstrates how to publish and consume a SOAP service for product data.
The provider exposes two operations:

- `getProduit(code)` returns one product
- `listeProduits()` returns a list of products

## Project Structure

- `SOAP_Provider/src/main/java/org/soap/soap_provider/webservice/ProduitWebService.java`: SOAP endpoint implementation
- `SOAP_Provider/src/main/java/org/soap/soap_provider/server/ServerWS.java`: publishes the service endpoint
- `SOAP_Client/src/main/java/org/soap/soap_client/Client/ClientWs.java`: example client that calls the SOAP service
- `SOAP_Client/src/main/java/proxy/`: generated SOAP client stubs

## Requirements

- Java 17 or newer for the client
- Java 26 or compatible environment for the provider, as defined in the Maven configuration
- Maven 3.9+ or the bundled Maven wrapper

## How It Works

The provider starts a Spring Boot application and publishes the SOAP endpoint at:

- `http://127.0.0.1:8090/`

The client uses the generated proxy classes to call the provider service.

## Run the Provider

From the `SOAP_Provider` folder:

```bash
./mvnw spring-boot:run
```

The service is published when the application starts.

## Run the Client

1. Start the provider first.
2. Run the `ClientWs` class from your IDE, or launch the client application if you want the Spring Boot project to start.

The sample client prints the price of the product returned by `getProduit(1)`.

## SOAP Operations

### `getProduit`

Returns a product by code.

Example response fields include:

- `code`
- `designation`
- `prix`
- `dateCreation`

### `listeProduits`

Returns a fixed list of sample products:

- PC
- Tablette
- Souris

## Notes

- The provider uses `jakarta.xml.ws.Endpoint` to publish the SOAP service.
- The client relies on the generated classes under the `proxy` package.
- The provider disables JDBC auto-configuration because this sample does not use a database.

## Suggested Workflow

1. Run `SOAP_Provider`.
2. Verify that the endpoint is deployed on port `8090`.
3. Run `SOAP_Client` and execute `ClientWs`.
4. Inspect the console output for the returned product price.
