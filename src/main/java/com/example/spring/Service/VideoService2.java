package com.example.spring.Service;

import com.example.spring.Mapper.EpisodeMapper;
import com.example.spring.Mapper.VideoMapper;
import com.example.spring.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Vector;

@Service
public class VideoService2 {

    @Autowired
    EpisodeMapper episodeMapper;
    @Autowired
    VideoMapper videoMapper;

    public Video find(String bv){
        Video video = videoMapper.findByBv(bv);
        video.setPlayList(episodeMapper.findByBv(bv));
        return video;
    }

}
