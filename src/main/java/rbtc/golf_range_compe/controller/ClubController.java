package rbtc.golf_range_compe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rbtc.golf_range_compe.entity.Club;
import rbtc.golf_range_compe.service.club.ClubService;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {

    @Autowired
    ClubService clubService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Club>> getAllClubs() {
        return new ResponseEntity<>(clubService.getAllClubs(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Club> saveClub(@RequestBody Club club) {
        return new ResponseEntity<>(clubService.saveClub(club), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> removeClub(@RequestParam Integer id) {
        return new ResponseEntity<>(clubService.removeClub(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Club> updateClub(@RequestBody Club club) throws Exception {
        return new ResponseEntity<>(clubService.updateClub(club), HttpStatus.OK);
    }

}
