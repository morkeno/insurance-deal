package org.morken.subjectsystem;

import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;

import java.util.Set;

/** Mocked class for demonstration */
public class System {
  private final SystemDAO dao;
  private static int mockedId = 0;

  public System(SystemDAO dao) {
    this.dao = dao;
  }

  public Customer createNewCustomer() {
    mockedId += 1;
    Customer customer = new Customer(mockedId, Set.of());
    dao.addCustomer(customer);
    return customer;
  }

  public Customer createInsuranceDealForCustomer(long customerId, InsuranceDeal insuranceDeal) {
    Customer customer;
    try {
      customer = dao.getCustomer(customerId);
    } catch (Exception ex) {
      // Should probably be handled some other way, but for the purposes of this demonstration just
      // make a new customer
      customer = createNewCustomer();
    }

    customer.getInsurances().add(insuranceDeal);

    dao.updateCustomer(customer);

    return customer;
  }
}
