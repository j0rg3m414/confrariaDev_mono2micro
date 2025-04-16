package org.acme.travelorders;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("travelorder")
public class TravelOrderResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TravelOrder> orders() {
        return TravelOrder.listAll();
    }

    @GET
    @Path("findById")
    public TravelOrder findById(@QueryParam("id") Long id) {
        return TravelOrder.findById(id);
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public TravelOrder newTravelOrder(TravelOrder order){
        order.id = null;
        order.persist();
        return order;
    }
}
