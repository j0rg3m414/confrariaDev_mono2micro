package org.acme.travel_flight;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("travel-flight")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TravelFlightResource {

    @GET
    public List<TravelFlight> travelFlightList(){
        return TravelFlight.listAll();
    }

    @GET
    @Path("findById")
    public TravelFlight findById(@QueryParam("id") long id){
        return TravelFlight.findById(id);
    }

    @POST
    @Transactional
    public TravelFlight newTravelFlight(TravelFlight travelFlight){
        travelFlight.id = null;
        travelFlight.persist();
        return travelFlight;
    }

    @DELETE
    @Transactional
    public Response deleteById(long id){
        TravelFlight.deleteById(id);
        return Response.accepted().build();
    }
}
