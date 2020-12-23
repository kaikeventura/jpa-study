package com.kaikeventura.jpastudy.repository;

import com.kaikeventura.jpastudy.model.Songwriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongwriterRepository extends JpaRepository<Songwriter, Long> {
    Optional<Songwriter> findByName(String songwriterName);
}
