package com.axonactive.play;

import com.axonactive.match.Match;
import com.axonactive.resultvalue.ResultValue;
import com.axonactive.team.Team;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Play {

    private Team team;

    private Match match;

    private ResultValue result;


}
