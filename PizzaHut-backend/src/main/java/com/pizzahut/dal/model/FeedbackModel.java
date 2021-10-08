package com.pizzahut.dal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document
public class FeedbackModel {

    @Id
    private String id;
    private String user;
    private String message_type;
    private String description;
    private LocalDateTime datetime;

    public FeedbackModel() {
    }

    public FeedbackModel(String id, String user, String message_type, String description, LocalDateTime datetime) {
        this.id = id;
        this.user = user;
        this.message_type = message_type;
        this.description = description;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "FeedbackModel{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", message_type='" + message_type + '\'' +
                ", description='" + description + '\'' +
                ", datetime=" + datetime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}
