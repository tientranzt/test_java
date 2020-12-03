package com.axonactive.futsal;

// match -> play -> team -> player

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Match {
    private Schedule schedule;

    private String location;

    public Match(Schedule schedule, String location) {
        this.schedule = schedule;
        this.location = location;
    }


}
