package rbtc.golf_range_compe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rbtc.golf_range_compe.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
