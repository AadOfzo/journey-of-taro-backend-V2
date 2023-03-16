package JourneyOfTaroSpringTestV1.groupid.artefact.repository;

import JourneyOfTaroSpringTestV1.groupid.artefact.model.Song;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SongRepository extends JpaRepository<Song, ObjectId> {
//    Optional<Song> findAllBySongTitle(String songTitle);
//    Optional<Song> findSongById(ObjectId id);
//    List<Song> findAllBySongTitleEqualsIgnoreCase(String songTitle);
}
