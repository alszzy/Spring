package com.example.spring.Controller;

import com.example.spring.Service.VideoService;
import com.example.spring.Service.VideoService2;
import com.example.spring.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @Autowired
    private VideoService2 vs;

    @RequestMapping("/video/{bv}")
    public Video updateVideo(@PathVariable String bv){
        return vs.find(bv);
    }
}
