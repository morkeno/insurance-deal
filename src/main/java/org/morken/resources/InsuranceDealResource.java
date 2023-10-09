package org.morken.resources;

import org.morken.api.InsuranceDeal;
import org.morken.api.InsuranceDealInput;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/insurance")
public class InsuranceDealResource {

    @POST
    @Path("/insurance")
    public Response createInsuranceDeal(InsuranceDealInput input) {
        // TODO
        // doCallSubjectSystem()
        //return "Success or failure. deal number and status as object if created";
        return Response.ok(new InsuranceDeal()).build();
    }
}
