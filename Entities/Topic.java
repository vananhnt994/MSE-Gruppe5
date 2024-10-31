package Entities;

public class Topic {
    private String id;
    private String topicDescription;

    // Constructor
    public Topic(String id, String topicDescription) {
        this.id = id;
        this.topicDescription = topicDescription;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}