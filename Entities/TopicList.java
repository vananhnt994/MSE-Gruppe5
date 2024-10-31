package Entities;

import Entities.Topic;

import java.util.List;

public class TopicList {
    private String id;
    private String postalCode; // Corresponds to plz
    private String districtName; // Corresponds to landkreisName
    private List<Topic> topicList; // Corresponds to themenliste

    // Constructor
    public TopicList(String id, String postalCode, String districtName, List<Topic> topicList) {
        this.id = id;
        this.postalCode = postalCode;
        this.districtName = districtName;
        this.topicList = topicList;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }
}