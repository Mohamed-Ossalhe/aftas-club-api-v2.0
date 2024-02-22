package ma.youcode.aftasclubapiv2.repositories;

import ma.youcode.aftasclubapiv2.entities.Competition;
import ma.youcode.aftasclubapiv2.entities.Hunting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Spring Data JPA repository for the {@link Hunting} entity.
 *
 * @author Mohamed Ossalhe
 */
@Repository
public interface HuntingRepository extends JpaRepository<Hunting, UUID> {
}
