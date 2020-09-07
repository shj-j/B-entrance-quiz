package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamRepository {
    private final static List<Team> teamList = new ArrayList<>();

    static {
        teamList.add(Team.builder().teamName("Team 1").build());
        teamList.add(Team.builder().teamName("Team 2").build());
        teamList.add(Team.builder().teamName("Team 3").build());
        teamList.add(Team.builder().teamName("Team 4").build());
        teamList.add(Team.builder().teamName("Team 5").build());
        teamList.add(Team.builder().teamName("Team 6").build());
    }

    public List<Team> getTeamList() {
        return teamList;
    }
}
