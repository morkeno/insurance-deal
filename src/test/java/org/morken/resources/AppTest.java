package org.morken.resources;

import org.glassfish.grizzly.utils.Pair;
import org.junit.jupiter.api.Test;
import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;
import org.morken.api.InsuranceDealInput;
import org.morken.api.InsuranceType;

import java.util.Objects;
import java.util.Set;

class AppTest {

  @Test
  void testFlow() throws Exception {
    CustomerResource customerResource = new CustomerResource();
    InsuranceDealResource insuranceResource = new InsuranceDealResource();

    Pair<Long, Long> ids =
        insuranceResource.createInsuranceDeal(new InsuranceDealInput(InsuranceType.STANDARD));

    assert ids.getFirst() == 1;
    assert ids.getSecond() == 1;

    assert Objects.equals(
        customerResource.getStatus(1),
        new Customer(1, Set.of(new InsuranceDeal(1, true, InsuranceType.STANDARD))));
  }
}
