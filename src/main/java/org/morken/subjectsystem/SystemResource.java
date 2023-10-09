package org.morken.subjectsystem;

import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;

import javax.ws.rs.core.Response;

/** Mocked class for demonstration */
public class SystemResource {

  private final System system;
  private final SystemDAO dao;

  public SystemResource(System system, SystemDAO dao) {
    this.system = system;
    this.dao = dao;
  }

  public Response createCustomer() {
    Customer customer = system.createNewCustomer();
    return Response.ok(customer.getId()).build();
  }

  public Response createInsurance(long customerId, InsuranceDeal insurance) {
    system.createInsuranceDealForCustomer(customerId, insurance);
    return Response.ok(insurance.getId()).build();
  }

  public Response getCustomer(long customerId) {
    try {
      return Response.ok(dao.getCustomer(customerId)).build();
    } catch (Exception e) {
      return Response.serverError().build();
    }
  }
}
