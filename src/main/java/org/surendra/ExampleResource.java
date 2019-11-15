package org.surendra;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return politeHello("Surendra");
    }

    @ConfigProperty(name = "greeting")
    private String greeting;

    public String politeHello(String name){
        return greeting + " " + name;
    }
}