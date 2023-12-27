package rbtc.golf_range_compe.service.player;

import rbtc.golf_range_compe.entity.Player;

import java.util.List;


public interface PlayerService {

     Player savePlayer(Player player);

     String removePlayer(Integer id);

     Player updatePlayer(Player player) throws Exception;

     List<Player> getAllPlayers();
}
