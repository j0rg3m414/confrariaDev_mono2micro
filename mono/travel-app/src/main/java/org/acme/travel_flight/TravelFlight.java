package org.acme.travel_flight;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class TravelFlight extends PanacheEntity {

    //Métodos publicos, pois o Panache já gera todos os getters e setters e toddo mapeamento
    public Long travelOrderId;
    public String fromAirport;
    public String toAirport;
}
