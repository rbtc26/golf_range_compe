package rbtc.golf_range_compe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rbtc.golf_range_compe.entity.Player;
import rbtc.golf_range_compe.service.Player.PlayerService;

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
    public String removePlayer(@RequestParam Integer id) {
        return playerService.removePlayer(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Player updatePlayer(@RequestBody Player player) throws Exception {
        return playerService.updatePlayer(player);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Player> getPlayers() {
        return playerService.getAllPlayers();
    }
}
