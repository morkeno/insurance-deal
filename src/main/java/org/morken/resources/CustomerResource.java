package org.morken.resources;

import org.morken.api.Customer;
import org.morken.subjectsystem.System;
import org.morken.subjectsystem.SystemDAO;
import org.morken.subjectsystem.SystemResource;

import javax.ws.rs.*;

@Path("/customer")
public class CustomerResource extends Resource{

  public CustomerResource() {
  }

  @GET
  @Path("/{customer_id}/status")
  @Produces("application/json")
  public Customer getStatus(@PathParam("customer_id") long customerId) throws Exception {
    return systemResource.getCustomer(customerId);
  }

  @POST
  @Path("/new")
  public long createCustomer() throws Exception {
    return systemResource.createCustomer();
  }
}
