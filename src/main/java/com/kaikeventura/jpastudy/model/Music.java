package com.kaikeventura.jpastudy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
public class Music implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "songwriter_id", nullable = false)
    @Setter
    private Songwriter songwriter;

    public Music(String name, Songwriter songwriter) {
        this.name = name;
        this.songwriter = songwriter;
    }
}
