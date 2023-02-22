package cinema.model.request;

import cinema.model.SeatEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter@NoArgsConstructor
@AllArgsConstructor
public class SeatCoordinatesRequest {
    int row;
    int column;

    public SeatCoordinatesRequest(SeatEntity seatEntity) {
        this.row = seatEntity.getRow();
        this.column = seatEntity.getColumn();
    }
}
