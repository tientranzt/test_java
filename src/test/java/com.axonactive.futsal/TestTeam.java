package com.axonactive.futsal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTeam {
    Team team;

    @BeforeEach
    public void init() {
        team = new Team("team1");
    }

    @Test
    public void addPlayerLessThen12Member_When_Ok(){
        team.addMember(new Player("player1"));
        System.out.println(team.getMember().size());
        assertEquals(1, team.getMember().size(), "Expected");

    }

    @Test
    public void addPlayerMoreThan12Member_When_Ok(){
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        team.addMember(new Player("player1"));
        assertEquals(12, team.getMember().size());
    }

    @AfterEach
    public void testDone() {
        team = null;
    }

}