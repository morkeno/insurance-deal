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

  public long createCustomer() {
    Customer customer = system.createNewCustomer();
    return customer.getId();
  }

  public long createInsurance(long customerId, InsuranceDeal insurance) {
    system.createInsuranceDealForCustomer(customerId, insurance);
    return insurance.getId();
  }

  public Customer getCustomer(long customerId) throws Exception {
      return dao.getCustomer(customerId);
  }
}
