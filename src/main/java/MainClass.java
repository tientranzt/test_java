import java.util.ArrayList;

/**
 * ICT companies in Can Tho plan to organize Futsal tournaments (called CT ICT friendship).
 * Let's develop a java-based application
 * to manage registered teams, generate match schedules and record results of matches.
 * Some requirements:
 * - A team must have at least 7 players and maximum is 12
 * - A player must be working for that company (each company has a team)
 */

public class MainClass {

    public static void main(String[] args) {

        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        Company company1 = new Company("ict1", team1);
        Company company2 = new Company("ict2", team2);

        //add player for team 1
        team1.addTeamMember(new Player("team1-p1"));
        team1.addTeamMember(new Player("team1-p2"));
        team1.addTeamMember(new Player("team1-p3"));
        team1.addTeamMember(new Player("team1-p4"));
        team1.addTeamMember(new Player("team1-p5"));
        team1.addTeamMember(new Player("team1-p6"));
        team1.addTeamMember(new Player("team1-p7"));

        // add player for team 2
        team2.addTeamMember(new Player("team2-p1"));
        team2.addTeamMember(new Player("team2-p2"));
        team2.addTeamMember(new Player("team2-p3"));
        team2.addTeamMember(new Player("team2-p4"));
        team2.addTeamMember(new Player("team2-p5"));
        team2.addTeamMember(new Player("team2-p6"));
        team2.addTeamMember(new Player("team2-p7"));

        Game game1 = new Game(team1, team2);

        game1.generateMatch();
        game1.setScore(team1);
        game1.setScore(team1);
        game1.endGame();
        game1.showResult();

    }

}


class Company {
    private String name;
    private Team team;

    public Company(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}


class Team {
    private String name;
    private ArrayList<Player> teamMember;
    private int win = 0;
    private int lose = 0;
    private int tie = 0;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
        this.teamMember = new ArrayList<>();
    }

    public void addTeamMember(Player player) {
        if (player == null) System.out.println("Player invalid");
        else if (teamMember.size() < 7) {
            teamMember.add(player);
            System.out.println("Need more player");

        } else if (teamMember.size() < 11) {
            teamMember.add(player);
            System.out.println("Size of team can be extended to 12");
        } else if (teamMember.size() == 11) System.out.println("Maximum member can be register");
    }

    public ArrayList<Player> getTeamMember() {
        return teamMember;
    }

    public String getName() {
        return name;
    }

    public void setWin() {
        this.win++;
    }

    public void setLose() {
        this.lose++;
    }

    public void setTie() {
        this.tie++;
    }
}

class Player {
    private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Game {
    private Team team1;
    private Team team2;
    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;


    public Game(Team team1) {
        this.team1 = team1;
    }

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public boolean isTeamValid(ArrayList<Player> memberList) {
        if (memberList.size() < 7) {
            return false;
        }
        return true;
    }

    public void generateMatch() {
        boolean isValidTeam1 = isTeamValid(team1.getTeamMember());
        boolean isValidTeam2 = isTeamValid(team2.getTeamMember());

        if (isValidTeam1 && isValidTeam2) {
            System.out.println(team1.getName() + " and " + team2.getName() + " is playing game");
        } else {
            System.out.println("Team size is not valid");
        }

    }

    public void setScore(Team team) {
        if (team.getName().equals(team1.getName())) {
            scoreTeam1++;
        } else scoreTeam2++;
    }

    public void endGame() {
        if (scoreTeam1 > scoreTeam2) {
            team1.setWin();
        } else if (scoreTeam2 > scoreTeam1) {
            team2.setWin();
        } else {
            team1.setTie();
            team2.setTie();
        }
    }

    public void showResult() {
        System.out.println(team1.getName() + " " + scoreTeam1 + " : " + team2.getName() + " " + scoreTeam2);
    }

}