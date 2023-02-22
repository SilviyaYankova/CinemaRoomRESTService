package cinema.model.response;

import lombok.*;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class StatsResponse {
   int currentIncome;
   int numberOfAvailableSeats;
   int numberOfPurchasedTickets;
}
