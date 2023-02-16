package JourneyOfTaroSpringTestV1.groupid.artefact.repository;

import JourneyOfTaroSpringTestV1.groupid.artefact.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository <Music, Long> {

    List<Music> findAllMusicByIdEqualsIgnoreCase(String musicId);
}
