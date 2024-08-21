package com.example.spring;

import com.example.spring.Mapper.VideoMapper;
import com.example.spring.dto.Video;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestVideoMapper {

    @Autowired
    VideoMapper videoMapper;

    @Test
    public void testFindByBv(){
        Video video = videoMapper.findByBv("1");
        System.out.println(video);
    }
}
