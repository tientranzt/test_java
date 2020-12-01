public class MainClass {
/***
 *   ICT companies in Can Tho plan to organize Futsal tournaments (called CT ICT friendship).
 *     Let's develop a java-based application to manage registered teams, generate match schedules and record results of matches.
 *     Some requirements:
 *             - A team must have at least 7 players and maximum is 12
 *             - A player must be working for that company (each company has a team)
 */

//    Registered team (at least 7 maximum is 12,  working for that company)
//    Generate match schedule
//    Record result

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


class Player{
    private String name;
    private int age;
    private String gender;
    private Team team;


}

class Team{
    // register team
}


class Game{

    // generate match

    // record result

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

