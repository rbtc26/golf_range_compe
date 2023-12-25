package rbtc.golf_range_compe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rbtc.golf_range_compe.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player getPlayerById(Integer id);


}
