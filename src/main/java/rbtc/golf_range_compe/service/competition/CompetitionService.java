package rbtc.golf_range_compe.service.competition;

import rbtc.golf_range_compe.entity.Range;
import rbtc.golf_range_compe.model.RoundWinner;

public interface CompetitionService {

    RoundWinner getRoundWinner(Integer round);

    Range getLongestDistance();

    RoundWinner getGameWinner();
}
