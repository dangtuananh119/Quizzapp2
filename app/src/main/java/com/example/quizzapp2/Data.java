package com.example.quizzapp2;

public class Data {
    String topic, level, score;

    public Data(String topic, String level, String score) {
        this.topic = topic;
        this.level = level;
        this.score = score;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
