package com.axonactive.match;

// match -> play -> team -> player

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
public class Match {

    private int id;

    private LocalDateTime dateTime;

    private String location;

    public Match(int id, LocalDateTime dateTime, String location) {
        this.id = id;
        this.dateTime = dateTime;
        this.location = location;
    }



}
