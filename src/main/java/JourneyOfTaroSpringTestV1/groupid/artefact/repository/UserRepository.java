package JourneyOfTaroSpringTestV1.groupid.artefact.repository;

import JourneyOfTaroSpringTestV1.groupid.artefact.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
