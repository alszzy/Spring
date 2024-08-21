package com.example.spring.Mapper;

import com.example.spring.dto.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VideoMapper {

    @Select("""
        select bv,
               type,
               category,
               title,
               thumbnail,
               description,
               publish_datetime,
               tag,
               video_id
        from video where bv = #{bv};""")
    Video findByBv(String bv);
}
