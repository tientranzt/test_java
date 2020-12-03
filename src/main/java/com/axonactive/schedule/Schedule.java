package com.axonactive.schedule;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class Schedule {

    private LocalDateTime dateTime;

    public Schedule(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
