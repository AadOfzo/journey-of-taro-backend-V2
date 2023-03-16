package JourneyOfTaroSpringTestV1.groupid.artefact.controller;

import JourneyOfTaroSpringTestV1.groupid.artefact.exceptions.RecordNotFoundException;
import JourneyOfTaroSpringTestV1.groupid.artefact.model.Song;
import JourneyOfTaroSpringTestV1.groupid.artefact.repository.SongRepository;
import JourneyOfTaroSpringTestV1.groupid.artefact.service.SongService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//
//@RequestMapping("/songs")
//@RestController
public class SongsController {
//
//    @Autowired
//    private SongService songService;
//    private SongRepository songRepository;
//
//    @GetMapping("/songs")
//    public ResponseEntity<List<Song>> getSongs(@RequestParam(value = "songTitle", required = false) String songTitle) {
//
//        List<Song> songs;
//
//        if (songTitle == null) {
//            songs = SongRepository.findAllBySongTitle();
//        } else {
//            songs = SongRepository.findAllBySongTitleEqualsIgnoreCase(songTitle);
//        }
//
//        return ResponseEntity.ok().body(songs);
//    }
//
//    @GetMapping(value = "/songs/{songTitle}")
//    public ResponseEntity<Optional<Song>> getSingleSong(@PathVariable ObjectId id) {
//        Optional<Song> song = songRepository.findAllBySongTitle(ObjectId id);
//
//        if (song.isEmpty()){
//
//            throw new RecordNotFoundException("No Music found with this ID! " + id);
//
//        } else {
//
//            this.songService = song.get();
//
//            return ResponseEntity.ok().body(songService.getAllBySongTitle(id));
//        }
//    }
//
//    @PostMapping("/songs")
//    public ResponseEntity<Object> addSong(@RequestBody Song song) {
//
//        Song returnSong = songRepository.save(song);
//
//        return ResponseEntity.created(null).body(returnSong);
//    }
//
//    @DeleteMapping("/songs/{id}")
//    public ResponseEntity<Object> deleteSong(@PathVariable("id") Long id) {
//
//        songRepository.deleteById(id);
//
//        return ResponseEntity.noContent().build();
//    }
//
//    @PutMapping("/songs/{id}")
//    public ResponseEntity<Object> updateSong(@PathVariable Long id, @RequestBody Song songTitle) {
//
//        Optional<Song> songTitle = songRepository.findById(id);
//
//        if (songTitle.isEmpty()){
//
//            throw new RecordNotFoundException("No music is found with id: " + id);
//
//        } else {
//            Song songTitle1 = songTitle.get();
//            songTitle1.setFileName(songTitle1.getFileName());
//
//            Song returnSong = songRepository.save(songTitle1);
//
//            return ResponseEntity.ok().body(returnSong);
//        }
//    }
//
}
