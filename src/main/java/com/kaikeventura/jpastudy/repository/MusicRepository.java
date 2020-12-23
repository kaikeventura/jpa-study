package com.kaikeventura.jpastudy.repository;

import com.kaikeventura.jpastudy.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
}
