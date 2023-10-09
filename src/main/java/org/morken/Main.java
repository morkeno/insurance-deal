package org.morken;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.morken.resources.CustomerResource;
import org.morken.resources.InsuranceDealResource;

import java.net.URI;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define the base URI where the application will run
        String baseUri = "http://localhost:8080/";

        // Create a resource configuration that includes the resource class
        ResourceConfig config = new ResourceConfig(new HashSet<>(List.of(CustomerResource.class, InsuranceDealResource.class)));

        // Create and start the embedded Grizzly server
        GrizzlyHttpServerFactory.createHttpServer(URI.create(baseUri), config);

        System.out.println("Server started at " + baseUri);
        System.out.println("Press Ctrl+C to stop.");
    }
}