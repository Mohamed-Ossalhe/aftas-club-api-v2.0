package ma.youcode.aftasclubapiv2.repositories;

import ma.youcode.aftasclubapiv2.entities.Competition;
import ma.youcode.aftasclubapiv2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Spring Data JPA repository for the {@link User} entity.
 *
 * @author Mohamed Ossalhe
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
