package rbtc.golf_range_compe.service.Competition;

import rbtc.golf_range_compe.entity.Player;
import rbtc.golf_range_compe.entity.Range;
import rbtc.golf_range_compe.model.RoundWinner;

public interface CompetitionService {

    RoundWinner getRoundWinner(Integer round);

    Range getLongestDistance();

    RoundWinner getGameWinner();
}
