package com.palkos.springlearningproject.models;

public class Room {
    private long id;
    private String number;
    private String name;
    private String info;
    public Room() {
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.setInfo(info);
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    
}
