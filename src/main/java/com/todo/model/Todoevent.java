package com.todo.model;

public class Todoevent {
    private Integer seq;

    private String eventId;

    private String userId;

    private String level;

    private String status;

    private Integer createDttm;

    private String content;

    public Todoevent(Integer seq, String eventId, String userId, String level, String status, Integer createDttm, String content) {
        this.seq = seq;
        this.eventId = eventId;
        this.userId = userId;
        this.level = level;
        this.status = status;
        this.createDttm = createDttm;
        this.content = content;
    }

    public Todoevent(Integer seq, String eventId, String content ,String level) {
        this.seq = seq;
        this.eventId = eventId;
        this.content = content;
        this.level = level;
    }

    public Todoevent(String eventId, String content ,String level) {
        this.eventId = eventId;
        this.content = content;
        this.level = level;
    }

    public Todoevent() {
        super();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Integer createDttm) {
        this.createDttm = createDttm;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Todoevent{" +
                "seq=" + seq +
                ", eventId='" + eventId + '\'' +
                ", userId='" + userId + '\'' +
                ", level='" + level + '\'' +
                ", status='" + status + '\'' +
                ", createDttm=" + createDttm +
                ", content='" + content + '\'' +
                '}';
    }
}