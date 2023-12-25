package rbtc.golf_range_compe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rbtc.golf_range_compe.entity.Range;

import java.util.List;

@Repository
public interface RangeRepository extends JpaRepository<Range, Integer> {

    Range getRangeById(int id);
    List<Range> getAllByRound(int id);

}
