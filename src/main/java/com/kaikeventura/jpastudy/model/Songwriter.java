package com.kaikeventura.jpastudy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("musics")
    @OneToMany(mappedBy = "songwriter", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Music> musics;

    public Songwriter(String name) {
        this.name = name;
    }
}
