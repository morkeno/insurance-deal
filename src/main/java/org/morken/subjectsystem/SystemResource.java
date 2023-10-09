package org.morken.subjectsystem;

import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;

import javax.ws.rs.core.Response;

/**
 * Mocked class for demonstration
 */
public class SystemResource {

  private final System system;

    public SystemResource(System system) {
        this.system = system;
    }

    public Response createCustomer() {
        Customer customer = system.createNewCustomer();
        return Response.ok(customer.getId()).build();
    }

    public Response createInsurance(long customerId, InsuranceDeal insurance) {
        system.createInsuranceDealForCustomer(customerId, insurance);
        return Response.ok(insurance.getId()).build();
    }
}
