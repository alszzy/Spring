package com.example.spring;

import com.example.spring.Mapper.EpisodeMapper;
import com.example.spring.dto.Episode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestEpisodeMapper {
    @Autowired
    EpisodeMapper episodeMapper;

    @Test
    public void findByBv(){
        List<Episode> episodes = episodeMapper.findByBv("1");
        System.out.println(episodes.size());
    }
}
