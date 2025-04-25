package org.acme.travel_hotel;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class TravelHotel extends PanacheEntity {

    public long travelOrderId;
    public Integer nights;
}
