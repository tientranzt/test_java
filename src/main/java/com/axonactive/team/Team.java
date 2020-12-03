package com.axonactive.team;
import com.axonactive.player.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    
    private String logo;

    private String name;

    private String gender;

    private List<Player> member = new ArrayList<>();

    public void addMember(Player player) {

        if (member.size() < 12) {
            member.add(player);
        } else {
            throw new IllegalStateException("Maximum size of team member");
        }

    }

}


