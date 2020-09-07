package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public void save(Map<Integer, List<Student>> teamMap) {
//        teamList.forEach(team -> team.setStudentsList(teamMap.get(team.g)));
        for(int i = 0 ; i < 6 ; i++ ){
            teamList.get(i).setStudentsList(teamMap.get(i+1));
        }
    }
}
