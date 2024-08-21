package com.example.spring.Mapper;

import com.example.spring.dto.Episode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EpisodeMapper {

    @Select("""
    select episode_id, title, url, duration, id, bv
    from episode where bv = #{bv}
""")
    List<Episode> findByBv(String bv);
}
