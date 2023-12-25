package rbtc.golf_range_compe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rbtc.golf_range_compe.entity.Player;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoundWinner {
    private Player player;

    private double distance;
}
