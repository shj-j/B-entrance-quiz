package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentRepository;
import com.thoughtworks.capability.gtb.entrancequiz.repository.TeamRepository;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeamRepository teamRepository;

    @Test
    public void shouldReturnAllStudents() throws Exception {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(Student.builder().id(1).name("沈乐棋").build());
//        studentList.add(Student.builder().id(2).name("沈乐棋").build());
        mockMvc.perform(get("/students"))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(status().isOk());
    }

//    @Test
//    public void shouldReturnAllTeams() throws Exception {
//        mockMvc.perform(get("/teams"))
//                .andExpect(jsonPath("$.length()", is(6)))
//                .andExpect(status().isOk());
//    }
}
