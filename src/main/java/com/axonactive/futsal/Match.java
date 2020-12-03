package com.axonactive.futsal;


public class Match {


    private Team team1;

    private Team team2;

    private Schedule schedule;

    private String location;

    private Result result;

    public Match(Team team1, Team team2, Schedule schedule, String location, Result result) {
        this.team1 = team1;
        this.team2 = team2;
        this.schedule = schedule;
        this.location = location;
        this.result = result;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void updateScore(Team team){

    }

//    public void addScore(Team team){
//        if(team.getName().equals(team1.getName())){
//            scoreTeam1++;
//        }
//        else {
//            scoreTeam2++;
//        }
//    }

//    public int getScoreTeam1() {
//        return scoreTeam1;
//    }
//
//    public int getScoreTeam2() {
//        return scoreTeam2;
//    }
}
