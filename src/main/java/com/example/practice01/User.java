package com.example.practice01;

public class User {
    public static final String HARBIN = "哈尔滨";
    public static final String BEIJING = "北京";
    private int id;
    private String name;
    private String city;

    public User() {
    }

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
