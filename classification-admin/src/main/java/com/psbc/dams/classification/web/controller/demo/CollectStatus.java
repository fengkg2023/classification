package com.psbc.dams.classification.web.controller.demo;

public class CollectStatus {
    private int id;
    private String users;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String user) {
        this.users = users;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CollectStatus{" +
                "id=" + id +
                ", users='" + users + '\'' +
                ", status=" + status +
                '}';
    }
}
