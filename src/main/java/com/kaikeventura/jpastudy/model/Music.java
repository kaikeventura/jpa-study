package com.kaikeventura.jpastudy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
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
    @Getter
    private Long id;

    @JsonProperty("name")
    @Getter
    private String name;

    @ManyToOne
    @JoinColumn(name = "songwriter_id")
    @Setter
    @Getter
    private Songwriter songwriter;

    public Music(String name, Songwriter songwriter) {
        this.name = name;
        this.songwriter = songwriter;
    }
}
