package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.Map;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(APPLICATION_JSON)
    public Map<String,String> hello() {
        return Map.of("msg", "Steve was here.");
    }
}
