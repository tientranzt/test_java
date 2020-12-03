package com.axonactive.futsal;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Team {

    private int id;

    private String name;

    private List<Player> member = new ArrayList<>();

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

}


