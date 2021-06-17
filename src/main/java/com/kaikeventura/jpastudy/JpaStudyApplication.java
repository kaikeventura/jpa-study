package com.kaikeventura.jpastudy;

import com.kaikeventura.jpastudy.model.Music;
import com.kaikeventura.jpastudy.model.Songwriter;
import com.kaikeventura.jpastudy.repository.MusicRepository;
import com.kaikeventura.jpastudy.repository.SongwriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JpaStudyApplication {

	@Autowired
	private SongwriterRepository songwriterRepository;

	@Autowired
	private MusicRepository musicRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaStudyApplication.class, args);
	}

	@PostConstruct
	void run() {
//		var songwriter = new Songwriter("Led Zeppelin");
//		songwriterRepository.save(songwriter);
//
//		musicRepository.save(new Music("Stairway to Heaven", songwriter));
//		musicRepository.save(new Music("Communication Breakdown", songwriter));
//		musicRepository.save(new Music("Rock and Roll", songwriter));
	}

}
