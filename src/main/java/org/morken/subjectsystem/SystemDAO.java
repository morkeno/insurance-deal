package org.morken.subjectsystem;

import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;

import java.util.HashSet;
import java.util.Set;

/** Simple DAO in memory */
public class SystemDAO {
  private final Set<Customer> customers = new HashSet<>();

  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  public void updateCustomer(Customer customer) {
      customers.remove(customer);
      customers.add(customer);
  }

  public Customer getCustomer(long id) throws Exception {
    return customers.stream()
        .filter(c -> c.getId() == id)
        .findFirst()
        .orElseThrow(() -> new Exception("Customer with id " + id + " does not exist"));
  }
}
