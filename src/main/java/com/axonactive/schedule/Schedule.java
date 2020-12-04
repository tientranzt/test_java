package com.axonactive.schedule;

import com.axonactive.match.Match;
import com.axonactive.play.Play;
import com.axonactive.resultvalue.ResultValue;
import com.axonactive.team.Team;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@NoArgsConstructor
public class Schedule {

    private List<Play> plays = new ArrayList<>();

    private List<Team> teams = new ArrayList<>();

    private void shuffleTeam() {

        Collections.shuffle(teams);

    }

    private void addTeamToPlayWithoutResidual(int matchId) {

        plays.add(new Play(teams.get(0), new Match(matchId, LocalDateTime.now(), "Can Tho")));

        plays.add(new Play(teams.get(1), new Match(matchId, LocalDateTime.now(), "HCM")));

        teams.remove(0);

        teams.remove(1);
    }

    private void addTeamToPlayWithResidual() {

        // process

    }

    public void generateSchedule(int numberOfGroup) {

        int sizeOfTeams = teams.size();

        if (sizeOfTeams % numberOfGroup == 0) {

            for (int number = 0; number < sizeOfTeams / 2; number++) {

                shuffleTeam();
                addTeamToPlayWithoutResidual(number);

            }

        } else {

            int residualOfTeams = sizeOfTeams % numberOfGroup;

            addTeamToPlayWithResidual();

        }
    }

}
