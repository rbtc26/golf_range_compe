package rbtc.golf_range_compe.service.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rbtc.golf_range_compe.entity.Player;
import rbtc.golf_range_compe.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public String removePlayer(Integer id) {
        Player player = playerRepository.getPlayerById(id);
        if (player != null){
            playerRepository.delete(player);
            return "Successfully removed player " + player.getPlayerName();
        }
        return "No player found.";
    }

    @Override
    public Player updatePlayer(Player player) throws Exception {
        if (player == null){
            throw new Exception("Player not found", null);
        }

        Player update = playerRepository.getPlayerById(player.getId());
        update.setPlayerName(player.getPlayerName());
        playerRepository.save(update);
        return update;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }


}
