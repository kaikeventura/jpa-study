package com.kaikeventura.jpastudy.service;

import com.kaikeventura.jpastudy.model.Music;
import com.kaikeventura.jpastudy.model.Songwriter;
import com.kaikeventura.jpastudy.repository.MusicRepository;
import com.kaikeventura.jpastudy.repository.SongwriterRepository;
import com.kaikeventura.jpastudy.repository.projection.SongwriterProjection;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SongwriterService {

    private final SongwriterRepository songwriterRepository;
    private final MusicRepository musicRepository;

    public Songwriter create(final Songwriter songwriter) {
        return songwriterRepository.save(songwriter);
    }

    public Music addMusic(final String songwriterName, final Music music) {
        music.setSongwriter(findSongwriterByName(songwriterName));
        return musicRepository.save(music);
    }

    public Songwriter fetchSongwriterByName(final String songwriterName) {
        return findSongwriterByName(songwriterName);
    }

    private Songwriter findSongwriterByName(final String songwriterName) {
        return songwriterRepository.findByName(songwriterName).orElseThrow(RuntimeException::new);
    }

    public SongwriterProjection findSongwriterByName2(final String songwriterName) {
        return songwriterRepository.findByName(songwriterName, SongwriterProjection.class).orElseThrow(RuntimeException::new);
    }
}
