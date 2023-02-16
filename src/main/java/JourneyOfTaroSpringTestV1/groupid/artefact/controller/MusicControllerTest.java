package JourneyOfTaroSpringTestV1.groupid.artefact.controller;

import JourneyOfTaroSpringTestV1.groupid.artefact.exceptions.RecordNotFoundException;
import JourneyOfTaroSpringTestV1.groupid.artefact.model.Music;
import JourneyOfTaroSpringTestV1.groupid.artefact.repository.MusicRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MusicControllerTest {

    private final MusicRepository musicRepository;

    public MusicControllerTest(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @GetMapping("/allmusic")
    public ResponseEntity<List<Music>> getAllMusic(@RequestParam(value = "musicId", required = false) String musicId) {

        List<Music> allmusic;

        if (musicId == null) {
            allmusic = musicRepository.findAll();
        } else {
            allmusic = musicRepository.findAllMusicByIdEqualsIgnoreCase(musicId);
        }

        return ResponseEntity.ok().body(allmusic);
    }

    @GetMapping("/allmusic/{id}")
    public ResponseEntity<Music> getMusic(@PathVariable("id") Long id) {
        Optional<Music> music = musicRepository.findById(id);

        if (music.isEmpty()){

            throw new RecordNotFoundException("No Music found! " + id);

        } else {

            Music music1 = music.get();

            return ResponseEntity.ok().body(music1);
        }
    }

    @PostMapping("/allmusic")
    public ResponseEntity<Music> addMusic(@RequestBody Music music) {

        Music returnMusic = musicRepository.save(music);

        return ResponseEntity.created(null).body(returnMusic);
    }

    @DeleteMapping("/allmusic/{id}")
    public ResponseEntity<Object> deleteMusic(@PathVariable("id") Long id) {

        musicRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/allmusic/{id}")
    public ResponseEntity<Music> updateMusic(@PathVariable Long id, @RequestBody Music newMusic) {

        Optional<Music> music = musicRepository.findById(id);

        if (music.isEmpty()){

            throw new RecordNotFoundException("No music is found with id: " + id);

        } else {
            Music music1 = music.get();
            music1.setAlbumName(newMusic.getAlbumName());
            music1.setSongName(newMusic.getSongName());

            Music returnMusic = musicRepository.save(music1);

            return ResponseEntity.ok().body(returnMusic);
        }
    }
}
