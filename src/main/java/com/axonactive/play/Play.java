package com.axonactive.play;

import com.axonactive.match.Match;
import com.axonactive.resultvalue.ResultValue;
import com.axonactive.team.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Play {

    private Team team;

    private Match match;

    private ResultValue result;

    public Play(Team team, Match match) {
        this.team = team;
        this.match = match;
    }

    public void updateResultValue(ResultValue result){

        this.result = result;

    }



}
