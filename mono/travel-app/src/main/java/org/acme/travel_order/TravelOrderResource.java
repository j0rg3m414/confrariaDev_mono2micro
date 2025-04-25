package org.acme.travel_order;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("travel-order")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TravelOrderResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TravelOrder> travelOrders() {
        return TravelOrder.listAll();
    }

    @GET
    @Path("findById")
    public TravelOrder findById(@QueryParam("id") Long id){
        return TravelOrder.findById(id);
    }

    @POST
    @Transactional
    public TravelOrder newTravelOrder(TravelOrder order){
        order.id = null;
        order.persist();
        return order;
    }

    @DELETE
    @Transactional
    public Response deleteById(long id){
        TravelOrder.deleteById(id);
        return Response.accepted().build();
    }
}
