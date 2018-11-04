package com.shuvadip.bean;

public class Topic {

    private String topicName;
    private String topicDescription;
    private String topicId;

    public Topic(String topicName, String topicDescription, String topicId) {
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }
}
