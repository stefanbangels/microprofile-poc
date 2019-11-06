package org.assertdevelopments.microprofilepoc;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("config")
@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
public class ConfigResource {

    @Inject
    @ConfigProperty(name = "application.name")
    private String applicationName;

    @Inject
    @ConfigProperty(name = "application.version", defaultValue = "undefined")
    private String applicationVersion;

    @Inject
    private Config config;

    @GET
    @Path("/applicationName")
    public String applicationName() {
        return applicationName;
    }

    @GET
    @Path("/applicationVersion")
    public String applicationVersion() {
        return applicationVersion;
    }

    @GET
    @Path("/{key}")
    public String value(@PathParam("key") String key) {
        return config.getValue(key, String.class);
    }

}
