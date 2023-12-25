package rbtc.golf_range_compe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rbtc.golf_range_compe.entity.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {

    Club getClubById(Integer id);
}
