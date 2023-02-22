package cinema.model.response;

import lombok.Value;

@Value
public class SeatResponse {
    int row;
    int column;
    int price;
}
