package org.assertdevelopments.jakartaeepoc;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
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
