package org.morken.resources;

import javax.ws.rs.*;

@Path("/customer")
@Produces("application/json")
public class CustomerResource {

    @GET
    @Path("/{customer_id}/status")
    public Object getStatus(@PathParam("customer_id") long customerId) {
        // TODO
        return "deal number and status as object";
    }

}
