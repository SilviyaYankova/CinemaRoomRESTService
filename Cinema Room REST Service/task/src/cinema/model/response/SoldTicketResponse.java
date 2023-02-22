package cinema.model.response;

import cinema.model.SeatEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SoldTicketResponse {
    String token;
    SeatResponse ticket;

    public SoldTicketResponse(SeatEntity seatEntity) {
        this.token = seatEntity.getToken();
        this.ticket = new SeatResponse(seatEntity.getRow(), seatEntity.getColumn(), seatEntity.getSellPrice());
    }
}
