package rbtc.golf_range_compe.service.Competition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rbtc.golf_range_compe.entity.Player;
import rbtc.golf_range_compe.entity.Range;
import rbtc.golf_range_compe.model.RoundWinner;
import rbtc.golf_range_compe.repository.CompetitionRepository;
import rbtc.golf_range_compe.repository.RangeRepository;

import java.util.Comparator;
import java.util.List;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    CompetitionRepository competitionRepository;

    @Autowired
    RangeRepository rangeRepository;

    @Override
    public RoundWinner getRoundWinner(Integer round) {
        return getWinner(round);
    }

    @Override
    public RoundWinner getGameWinner() {
        return getWinner(null);
    }

    public RoundWinner getWinner(Integer round) {
        List<Range> rangeList;
        if (round == null) {
            rangeList = rangeRepository.findAll();
        } else {
            rangeList = competitionRepository.getAllByRound(round);
        }

        rangeList.sort((o1, o2) -> o2.getPlayer().getId() - o1.getPlayer().getId());

        double longestDistance = 0;
        Player player = null;

        for (Range range : rangeList) {
            double distance = rangeList.stream()
                    .filter(o -> o.getPlayer() == range.getPlayer())
                    .mapToDouble(Range::getDistance)
                    .sum();

            if (distance > longestDistance) {
                longestDistance = distance;
                player = range.getPlayer();
            }
        }
        return new RoundWinner(player, longestDistance);
    }

    @Override
    public Range getLongestDistance() {
        List<Range> rangeList = rangeRepository.findAll();
        return rangeList.stream()
                .max(Comparator.comparing(Range::getDistance))
                .stream()
                .findAny()
                .orElse(null);
    }

}
