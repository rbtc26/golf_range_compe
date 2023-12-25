package rbtc.golf_range_compe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rbtc.golf_range_compe.entity.Club;
import rbtc.golf_range_compe.service.Club.ClubService;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {

    @Autowired
    ClubService clubService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Club saveClub(@RequestBody Club club) {
        return clubService.saveClub(club);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String removeClub(@RequestParam Integer id) {
        return clubService.removeClub(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Club updateClub(@RequestBody Club club) throws Exception {
        return clubService.updateClub(club);
    }

}
