package com.softy.crudApi.CustomResponses;

public class EmployeeDeletedResponse {
    private int id;
    private long timeStamp;

    private String msg;

    public EmployeeDeletedResponse(int id, long timeStamp) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.msg = "Employee Deleted with " +
                "id=" + id +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
