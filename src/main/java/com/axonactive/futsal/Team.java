package com.axonactive.futsal;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;

    private int score;

//    private int win = 0;

//    private int lose = 0;

//    private int tie = 0;

    private List<Player> member = new ArrayList<>();

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public void addMember(Player player) {

        if (member.size() < 12) {
            member.add(player);
        } else {
            throw new IllegalStateException("Maximum size of team member");
        }
    }

    public List<Player> getMember() {
        return member;
    }

    public String getName() {
        return name;
    }



//    public void setWin(int win) {
//        this.win = win;
//    }
//
//    public void setLose(int lose) {
//        this.lose = lose;
//    }
//
//    public void setTie(int tie) {
//        this.tie = tie;
//    }
}


