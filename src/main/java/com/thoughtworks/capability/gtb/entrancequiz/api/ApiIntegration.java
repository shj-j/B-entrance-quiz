package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Team;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ApiIntegration {
    final TeamService teamService;
    final StudentService studentService;

    public ApiIntegration(TeamService teamService, StudentService studentService) {
        this.teamService = teamService;
        this.studentService = studentService;
    }

    @GetMapping("/teams")
    public ResponseEntity<List<Team>> getTeams(){

        return ResponseEntity.status(HttpStatus.OK).body(teamService.getTeams());
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public List<Student> grouping(){
        return studentService.getStudents();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

}
