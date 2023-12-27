package rbtc.golf_range_compe.service.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rbtc.golf_range_compe.entity.Club;
import rbtc.golf_range_compe.entity.Range;
import rbtc.golf_range_compe.repository.ClubRepository;
import rbtc.golf_range_compe.repository.RangeRepository;

import java.util.List;

@Service
public class RangeServiceImpl implements RangeService {

    @Autowired
    RangeRepository rangeRepository;

    @Autowired
    ClubRepository clubRepository;

    @Override
    public Range saveRange(Range range) {
        return rangeRepository.save(range);
    }

    @Override
    public Range updateRange(Range range) throws Exception {

        if (range==null) {
            throw new Exception("No Range found", null);
        }

        Range update = rangeRepository.getRangeById(range.getId());
        Club club = clubRepository.getClubById(range.getClub().getId());
        update.setClub(club);
        update.setDistance(range.getDistance());
        rangeRepository.save(update);
        return update;
    }

    @Override
    public String deleteRange(Integer id) {
        rangeRepository.deleteById(id);
        return "Successfully deleted";
    }

    @Override
    public List<Range> getRangeByRound(Integer id) {
        return rangeRepository.getAllByRound(id);
    }

    @Override
    public List<Range> getAllRangeRound() {
        return rangeRepository.findAll();
    }
}
