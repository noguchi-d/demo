package com.example.demo.resource;

import com.example.demo.entity.Person;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by noguchi on 17/05/28.
 */
@Component
@Path("/hello")
public interface HelloResource {

    @Path("/world")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String asText();

    @Path("/person/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Person getPerson(@PathParam("id") Integer id);
}
