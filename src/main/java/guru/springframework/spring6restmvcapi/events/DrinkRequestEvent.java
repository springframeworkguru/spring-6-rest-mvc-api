package guru.springframework.spring6restmvcapi.events;

import guru.springframework.spring6restmvcapi.model.BeerOrderLineDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt, Spring Framework Guru.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkRequestEvent {
    private BeerOrderLineDTO beerOrderLineDTO;
}
