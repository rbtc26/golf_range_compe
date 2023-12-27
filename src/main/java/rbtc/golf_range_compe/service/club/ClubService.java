package rbtc.golf_range_compe.service.club;

import rbtc.golf_range_compe.entity.Club;

import java.util.List;

public interface ClubService {

    Club saveClub(Club club);

    String removeClub(Integer id);

    Club updateClub(Club club) throws Exception;

    List<Club> getAllClubs();
}
