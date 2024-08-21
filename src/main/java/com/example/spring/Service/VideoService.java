package com.example.spring.Service;

import com.example.spring.dto.Episode;
import com.example.spring.dto.Video;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

@Service
public class VideoService {

    private Map<String, Video> videoMap = new HashMap<>();

    @PostConstruct
    public void init(){
        String csvFile = "/Users/sherman/Documents/codespace/Java/spring/src/main/resources/data/p.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> lines = reader.readAll();
            for (String[] line : lines) {
                String[] tags = line[7].split("_");
                List<Episode> episodes = getEpisodes(line[0]);
                videoMap.put(line[0] ,new Video(line[3], line[5], line[0], LocalDateTime.parse(line[6]), line[4], Arrays.asList(tags), episodes, line[2], line[1]));
            }
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

    public Video find(String bv){
        return videoMap.get(bv);
    }

    private static List<Episode> getEpisodes(String bv) throws IOException, CsvException {
        String csvFileVideo = "/Users/sherman/Documents/codespace/Java/spring/src/main/resources/data/v_" + bv + ".csv";
        List<Episode> episodes = new ArrayList<>();
        try(CSVReader reader1 = new CSVReader(new FileReader(csvFileVideo))) {
            List<String[]> vLines = reader1.readAll();
            for (String[] vLine : vLines) {
                episodes.add(new Episode(vLine[0], vLine[1], LocalTime.parse(vLine[3]), vLine[2]));
            }
        }
        return episodes;
    }
}
