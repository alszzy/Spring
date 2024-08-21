package com.example.spring.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Video {
    private String title;
    private String description;
    private String bv;
    private LocalDateTime publishedTime;
    private String thumbnail;
    private List<String> tagList;
    private String tag;
    public void setTag(String tag){
        this.tag = tag;
    }

    private List<Episode> playList;
    private String category;
    private String type;

    public Video() {
    }

    public Video(String title, String description, String bv, LocalDateTime publishedTime, String thumbnail, List<String> tagList, List<Episode> playList, String category, String type) {
        this.title = title;
        this.description = description;
        this.bv = bv;
        this.publishedTime = publishedTime;
        this.thumbnail = thumbnail;
        this.tagList = tagList;
        this.playList = playList;
        this.category = category;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBv() {
        return bv;
    }

    public void setBv(String bv) {
        this.bv = bv;
    }

    public LocalDateTime getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(LocalDateTime publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String> getTagList() {
        String tag = this.tag;
        if (tag == null)
            return List.of();
        return List.of(tag.split("_"));
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public List<Episode> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Episode> playList) {
        this.playList = playList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", bv='" + bv + '\'' +
                ", publishedTime=" + publishedTime +
                ", thumbnail='" + thumbnail + '\'' +
                ", tagList=" + tagList +
                ", playList=" + playList +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
