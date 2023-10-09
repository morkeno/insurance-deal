package org.morken.mail;

import javax.ws.rs.core.Response;

/**
 * Mocked class for demonstration
 */
public class MailService {

    public Response notifyCustomer() {
        return Response.ok().build();
    }

}
