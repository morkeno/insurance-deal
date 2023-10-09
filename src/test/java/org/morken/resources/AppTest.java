package org.morken.resources;

import org.junit.jupiter.api.Test;
import org.morken.api.Customer;
import org.morken.api.InsuranceDealInput;

class AppTest {

    @Test
    void testFlow() {
        Customer customer = new Customer();

        CustomerResource customerResource = new CustomerResource();
        InsuranceDealResource insuranceResource = new InsuranceDealResource();

        insuranceResource.createInsuranceDeal(new InsuranceDealInput());

    }
}