package org.morken.resources;

import org.morken.subjectsystem.SystemResource;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerResource {

  private SystemResource systemResource;

  public CustomerResource() {
    // Bean constructor
  }

  public CustomerResource(SystemResource systemResource) {
    this.systemResource = systemResource;
  }

  @GET
  @Path("/{customer_id}/status")
  public Response getStatus(@PathParam("customer_id") long customerId) {
    return Response.ok(systemResource.getCustomer(customerId)).build();
  }
}
