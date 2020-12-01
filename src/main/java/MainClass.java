import java.util.List;
/**
 * ICT companies in Can Tho plan to organize Futsal tournaments (called CT ICT friendship). Let's develop a java-based application
 * to manage registered teams, generate match schedules and record results of matches.
 * Some requirements:
 * - A team must have at least 7 players and maximum is 12
 * - A player must be working for that company (each company has a team)
 *
 * */

public class MainClass {

    public static void main(String[] args) {

    }

}


class Company {
    private String name;
    private String location;

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

}


class Player {

    private String name;
    private int age;
    private String gender;
    private Team team;


}

class Team {

    private Company company;

    public Team(Company companyName) {
        this.company = companyName;
    }

    public Company getCompany() {
        return company;
    }

    // register team
}


enum TeamValid {

}


class Game {

    private int scoreOfTeam1 = 0;
    private int scoreOfTeam2 = 0;

    private String nameOfTeam1;
    private String nameOfTeam2;


    // generate match
    public void generateGame(List<Player> team1, List<Player> team2) {

        boolean isTeam1Valid = checkTeam(team1);
        boolean isTeam2Valid = checkTeam(team2);

        if (isTeam1Valid && isTeam2Valid) {
            System.out.println("Generated match");
        } else {
            System.out.println("Match cancel");
        }
    }


    // check each team is valid
    private boolean checkTeam(List<Player> listTeam){
        int sizeOfTeam = listTeam.size();

        if(sizeOfTeam == 0) return false;
        if(!(7 >= sizeOfTeam && sizeOfTeam <= 12)){
            System.out.println(listTeam.get(0));
        }

        return true;

    }


    // check team is valid
    private boolean isTeamValid(List<Player> team1, List<Player> team2) {

        int memberOfTeam1 = team1.size();
        int memberOfTeam2 = team2.size();
        boolean isTeamOneValid = memberOfTeam1 >= 7 && memberOfTeam1 <= 12 ;
        boolean isTeamTwoValid = memberOfTeam1 >= 7 && memberOfTeam1 <= 12 ;

        if (isTeamOneValid) {
            return true;
        }

        else {
            System.out.println("team");
        }

        return true;
    }


    // record result
    public void updateScore(Player player){

    }

    // reset game
    public void resetGame(){
        System.out.println("Score of: ");
    }

}


// Company
// name
// address


// Player
// name
// age
// gender
// team


// Team
// team at least 7 players max 12
// name
// number of member
// company name(Company)


// Game
// - register team
// - generate match schedules
// - results of match

