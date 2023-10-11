package org.morken.resources;

import org.morken.api.Customer;
import org.morken.subjectsystem.System;
import org.morken.subjectsystem.SystemDAO;
import org.morken.subjectsystem.SystemResource;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/customer")
@Produces("application/json")
public class CustomerResource {

  private final SystemResource systemResource;

  public CustomerResource() {
    SystemDAO dao = new SystemDAO();
    systemResource = new SystemResource(new System(dao), dao);
  }

  public CustomerResource(SystemResource systemResource) {
    this.systemResource = systemResource;
  }

  @GET
  @Path("/{customer_id}/status")
  public Customer getStatus(@PathParam("customer_id") long customerId) throws Exception {
    return systemResource.getCustomer(customerId);
  }
}
