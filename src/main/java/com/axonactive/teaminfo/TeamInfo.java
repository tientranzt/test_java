package com.axonactive.teaminfo;

import com.axonactive.socialcontact.SocialInfo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamInfo {

    private String logo;

    private String name;

    private String gender;

    private String phone;

    private String email;

    private SocialInfo socialInfo;

}
