package org.morken.subjectsystem;

import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;
import org.morken.api.InsuranceType;

import java.util.Set;

/** Mocked class for demonstration */
public class System {
  private final SystemDAO dao;
  private static int mockedCustomerId = 0;
  private static int mockedInsuranceId = 0;

  public System(SystemDAO dao) {
    this.dao = dao;
  }

  public Customer createNewCustomer() {
    mockedCustomerId += 1;
    Customer customer = new Customer(mockedCustomerId, Set.of());
    dao.addCustomer(customer);
    return customer;
  }

  public long createInsuranceDealForCustomer(long customerId, InsuranceType insuranceDealType) {
    Customer customer;
    try {
      customer = dao.getCustomer(customerId);
    } catch (Exception ex) {
      // Should probably be handled some other way, but for the purposes of this demonstration just
      // make a new customer
      customer = createNewCustomer();
    }

    mockedInsuranceId += 1;
    customer.getInsurances().add(new InsuranceDeal(mockedInsuranceId, true, insuranceDealType));

    dao.updateCustomer(customer);

    return mockedInsuranceId;
  }
}
