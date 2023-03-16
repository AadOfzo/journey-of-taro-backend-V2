package JourneyOfTaroSpringTestV1.groupid.artefact.controller;

import JourneyOfTaroSpringTestV1.groupid.artefact.model.Song;
import JourneyOfTaroSpringTestV1.groupid.artefact.service.SongService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/songs")
public class SongsControllerTest {

    @Autowired
    private SongService songService;

    @GetMapping
    public ResponseEntity<List<Song>> getAllSongs() {
        return new ResponseEntity<List<Song>>(songService.allSongs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Song>> getSingleSong(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Song>>(songService.singleSong(id), HttpStatus.OK);
    }
}
