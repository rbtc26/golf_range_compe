package rbtc.golf_range_compe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rbtc.golf_range_compe.entity.Range;
import rbtc.golf_range_compe.model.RoundWinner;
import rbtc.golf_range_compe.service.club.RangeService;
import rbtc.golf_range_compe.service.competition.CompetitionService;

import java.util.List;

@RestController
@RequestMapping("/range")
public class RangeController {

    @Autowired
    private RangeService rangeService;

    @Autowired
    private CompetitionService competitionService;

    @RequestMapping(method = RequestMethod.POST)
    public Range saveRange(@RequestBody Range range) {
        return rangeService.saveRange(range);
    }

    @RequestMapping(value = "/{round}", method = RequestMethod.GET)
    public List<Range> getRangeByRound(@PathVariable("round") int round) {
        return rangeService.getRangeByRound(round);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Range> getAllRangeRounds() {
        return rangeService.getAllRangeRound();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteRound(@RequestParam Integer id) {
        return rangeService.deleteRange(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Range updateRound(@RequestBody Range range) throws Exception {
        return rangeService.updateRange(range);
    }

    @RequestMapping(value = "round-winner/{round}", method = RequestMethod.GET)
    public RoundWinner getRoundWinner(@PathVariable("round") int round) {
        return competitionService.getRoundWinner(round);
    }

    @RequestMapping(value = "longest-distance", method = RequestMethod.GET)
    public Range getLongestDistance() {
        return competitionService.getLongestDistance();
    }

    @RequestMapping(value = "winner", method = RequestMethod.GET)
    public RoundWinner getGameWinner() {
        return competitionService.getGameWinner();
    }
}
