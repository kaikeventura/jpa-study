package com.kaikeventura.jpastudy.controller;

import com.kaikeventura.jpastudy.model.Music;
import com.kaikeventura.jpastudy.model.Songwriter;
import com.kaikeventura.jpastudy.service.SongwriterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/songwriter")
@AllArgsConstructor
public class AppController {

    private final SongwriterService songwriterService;

    @PostMapping
    public ResponseEntity<Songwriter> create(@RequestBody final Songwriter songwriter) {
        return ResponseEntity.status(HttpStatus.CREATED).body(songwriterService.create(songwriter));
    }

    @PatchMapping("{songwriter_name}/music")
    public ResponseEntity<Music> create(
            @PathVariable("songwriter_name") final String songwriterName,
            @RequestBody final Music music
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(songwriterService.addMusic(songwriterName, music));
    }

    @GetMapping("{songwriter_name}")
    public ResponseEntity<Songwriter> fetch(@PathVariable("songwriter_name") final String songwriterName) {
        return ResponseEntity.status(HttpStatus.OK).body(songwriterService.fetchSongwriterByName(songwriterName));
    }
}
