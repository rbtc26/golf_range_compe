package rbtc.golf_range_compe.service.club;

import rbtc.golf_range_compe.entity.Range;

import java.util.List;

public interface RangeService {

    Range saveRange(Range range);

    Range updateRange(Range range) throws Exception;

    String deleteRange(Integer id);

    List<Range> getRangeByRound(Integer id);


    List<Range> getAllRangeRound();

}
