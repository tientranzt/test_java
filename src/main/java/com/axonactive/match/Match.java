package com.axonactive.match;

// match -> play -> team -> player

import com.axonactive.schedule.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Match {

    private Schedule schedule;

    private String location;

    private int competitionTime;



}
