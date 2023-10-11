package org.morken.resources;

import org.junit.jupiter.api.Test;
import org.morken.api.Customer;
import org.morken.api.InsuranceDealInput;
import org.morken.subjectsystem.System;
import org.morken.subjectsystem.SystemDAO;
import org.morken.subjectsystem.SystemResource;

class AppTest {

  @Test
  void testFlow() {
    Customer customer = new Customer();

    SystemDAO dao = new SystemDAO();
    SystemResource systemResource = new SystemResource(new System(dao), dao);
    CustomerResource customerResource = new CustomerResource(systemResource);
    InsuranceDealResource insuranceResource = new InsuranceDealResource();

    insuranceResource.createInsuranceDeal(new InsuranceDealInput());
  }
}
