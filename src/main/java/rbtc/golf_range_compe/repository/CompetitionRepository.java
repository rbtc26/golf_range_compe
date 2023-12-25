package rbtc.golf_range_compe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rbtc.golf_range_compe.entity.Range;

import java.util.List;

public interface CompetitionRepository extends JpaRepository<Range, Integer> {

    List<Range> getAllByRound(int round);

}
