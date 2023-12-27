package rbtc.golf_range_compe.service.club;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rbtc.golf_range_compe.entity.Club;
import rbtc.golf_range_compe.repository.ClubRepository;

import java.util.List;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    ClubRepository clubRepository;

    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public String removeClub(Integer id) {
        Club club = clubRepository.getClubById(id);
        if (club == null) {
            return "No club found.";
        }

        clubRepository.delete(club);
        return "Successfully removed";
    }

    @Override
    public Club updateClub(Club club) throws Exception {

        Club update = clubRepository.getClubById(club.getId());

        if (update == null) {
            throw new Exception("No club found", null);
        }

        update.setClubName(club.getClubName());
        clubRepository.save(update);
        return update;
    }

    @Override
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }
}
