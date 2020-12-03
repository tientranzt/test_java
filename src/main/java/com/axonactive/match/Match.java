package com.axonactive.match;

// match -> play -> team -> player

import com.axonactive.schedule.Schedule;
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
