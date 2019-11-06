package org.assertdevelopments.microprofilepoc;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("helloworld")
@ApplicationScoped
public class HelloWorldResource {

    @GET
    public Response helloWorld() {
        return Response.ok("Hello World").build();
    }

}
