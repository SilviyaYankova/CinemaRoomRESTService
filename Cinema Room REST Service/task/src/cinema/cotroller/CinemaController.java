package cinema.cotroller;

import cinema.exeption.NotAuthorizedException;
import cinema.model.request.SeatCoordinatesRequest;
import cinema.model.response.ReturnedTicketResponse;
import cinema.model.request.ReturnTicketRequest;
import cinema.model.response.CinemaRoomResponse;
import cinema.model.response.SoldTicketResponse;
import cinema.model.response.StatsResponse;
import cinema.service.CinemaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CinemaController {
    final CinemaService cinemaService;

    @GetMapping("/seats")
    CinemaRoomResponse getAvailableSeats() {
        return cinemaService.getCinemaRoomInfo();
    }

    @PostMapping("/purchase")
    SoldTicketResponse purchaseTicket(@RequestBody SeatCoordinatesRequest seat) {
        return cinemaService.purchase(seat);
    }

    @PostMapping("/return")
    ReturnedTicketResponse returnTicket(@RequestBody ReturnTicketRequest ticket) {
        return cinemaService.returnTicket(ticket.getToken());
    }

    @PostMapping("/stats")
    StatsResponse statistics(@RequestParam(required = false) String password) {
        log.info("secret = {}", password);
        if (!"super_secret".equals(password)) {
            throw new NotAuthorizedException();
        }
        return cinemaService.calcStats();
    }
}
