package com.axonactive.futsal;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Schedule {

    private LocalDateTime dateTime;

    public Schedule(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
