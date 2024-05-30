package com.example.practice01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final List<User> USERS = create();
    private static List<User> create() {
        User u1 = new User(1,"BO",User.HARBIN);
        User u2 = new User(2,"SUN", User.BEIJING);
        User u3 = new User(3,"ZHANG", User.BEIJING);
        User u4 = new User(4,"LIU", User.HARBIN);
        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        return users;
    }

    public static void main(String[] args) {
        
        
    }
}
