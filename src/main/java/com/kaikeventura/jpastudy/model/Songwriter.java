package com.kaikeventura.jpastudy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@ToString
public class Songwriter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    @Getter
    private Long id;

    @JsonProperty("name")
    @Getter
    private String name;

    @JsonProperty("style")
    @Getter
    private String style;

    @JsonProperty("musics")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "songwriter", fetch = FetchType.EAGER)
    private Set<Music> musics;

    public Songwriter(String name, Set<Music> musics) {
        this.name = name;
        musics.forEach(music -> music.setSongwriter(this));
        this.musics = musics;
    }

    public Songwriter(String name) {
        this.name = name;
    }
}
