package com.axonactive.futsal;

// Vong dau -> Tran dau -> Doi -> Member
public class Match {
    private Schedule schedule;

    private String location;

    public Match(Schedule schedule, String location) {
        this.schedule = schedule;
        this.location = location;

    }
}
