create sequence travelorder_sequence start with 21 increment by 1;
insert into TravelOrder(id) values (nextval('travelorder_sequence'));
insert into TravelOrder(id) values (nextval('travelorder_sequence'));
insert into TravelOrder(id) values (nextval('travelorder_sequence'));
insert into TravelOrder(id) values (nextval('travelorder_sequence'));
insert into TravelOrder(id) values (nextval('travelorder_sequence'));
insert into TravelOrder(id) values (nextval('travelorder_sequence'));

create sequence flight_sequence start with 1 increment by 1;
insert into TravelFlight(id,travelOrderId,fromAirport,toAirport) values (nextval('flight_sequence'),1,'GRU','MCO');
insert into TravelFlight(id,travelOrderId,fromAirport,toAirport) values (nextval('flight_sequence'),2,'GRU','JFK');
insert into TravelFlight(id,travelOrderId,fromAirport,toAirport) values (nextval('flight_sequence'),3,'GRU','ATL');
insert into TravelFlight(id,travelOrderId,fromAirport,toAirport) values (nextval('flight_sequence'),4,'GRU','MEX');

create sequence hotel_sequence start with 1 increment by 1;
insert into TravelHotel(id,travelOrderId,nights) values (nextval('hotel_sequence'),1,5);
insert into TravelHotel(id,travelOrderId,nights) values (nextval('hotel_sequence'),2,2);
insert into TravelHotel(id,travelOrderId,nights) values (nextval('hotel_sequence'),3,3);
insert into TravelHotel(id,travelOrderId,nights) values (nextval('hotel_sequence'),4,10);
insert into TravelHotel(id,travelOrderId,nights) values (nextval('hotel_sequence'),5,30);