package org.acme.travel_hotel;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.travel_order.TravelOrder;

import java.util.List;

@Path("travel-hotel")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TravelHotelResource {

    @GET
    public List<TravelHotel> travelHotelList(){
        return TravelHotel.listAll();
    }

    @GET
    @Path("findById")
    public TravelHotel findById(@QueryParam("id") long id){
        return TravelHotel.findById(id);
    }

    @POST
    @Transactional
    public TravelHotel newTravelHotel(TravelHotel travelHotel){
        travelHotel.id = null;
        travelHotel.persist();
        return travelHotel;
    }

    @DELETE
    @Transactional
    public Response deleteById(@QueryParam("id") long id){
        TravelHotel.deleteById(id);
        return Response.accepted().build();
    }
}
