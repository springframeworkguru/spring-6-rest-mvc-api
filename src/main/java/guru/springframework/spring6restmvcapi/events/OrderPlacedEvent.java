package guru.springframework.spring6restmvcapi.events;

import guru.springframework.spring6restmvcapi.dto.BeerOrderDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt, Spring Framework Guru.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {

    private BeerOrderDTO beerOrderDTO;
}
