package JourneyOfTaroSpringTestV1.groupid.artefact.service;

import JourneyOfTaroSpringTestV1.groupid.artefact.exceptions.RecordNotFoundException;
import JourneyOfTaroSpringTestV1.groupid.artefact.model.Song;
import JourneyOfTaroSpringTestV1.groupid.artefact.repository.SongRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public List<Song> allSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> singleSong(ObjectId id) {
        return songRepository.findById(id);
    }

}
