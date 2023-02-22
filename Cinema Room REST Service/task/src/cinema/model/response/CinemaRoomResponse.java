package cinema.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CinemaRoomResponse {
    private int totalRows;
    private int totalColumns;
    private List<SeatResponse> availableSeats;
}
