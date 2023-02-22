package cinema.service;

import cinema.model.response.CinemaRoomResponse;
import cinema.model.request.SeatCoordinatesRequest;
import cinema.model.response.ReturnedTicketResponse;
import cinema.model.response.SoldTicketResponse;
import cinema.model.response.StatsResponse;

public interface CinemaService {
    CinemaRoomResponse getCinemaRoomInfo();

    SoldTicketResponse purchase(SeatCoordinatesRequest seat);

    ReturnedTicketResponse returnTicket(String token);

    StatsResponse calcStats();
}
