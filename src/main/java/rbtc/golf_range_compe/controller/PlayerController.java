package rbtc.golf_range_compe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rbtc.golf_range_compe.entity.Player;
import rbtc.golf_range_compe.service.player.PlayerService;

import java.util.List;

@RestController()
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.POST)
    public void savePlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> removePlayer(@RequestParam Integer id) {
        return new ResponseEntity<>(playerService.removePlayer(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) throws Exception {
        return new ResponseEntity<>(playerService.updatePlayer(player), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Player>> getPlayers() {
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }
}
