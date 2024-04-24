package com.example.test1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class Test {
    public static void main(String[] args) {
        //创建五个用户，分属三个不同的城市
        Set<User> users = new HashSet<>();
        User user1 = new User(1,"小明", "上海");
        User user2 = new User(2, "小红", "北京");
        User user3 = new User(3, "小刚", "哈尔滨");
        User user4 = new User(4, "小王", "哈尔滨");
        User user5 = new User(5, "小青", "上海");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        /*
        for(User u : users){
            System.out.println(u.getId() + ", " + u.getName() + ", " + u.getCity());
        }

         */
        List<User> userList = Turn(users);
        for (User u : userList) {
            System.out.println(u.getId() + ", " + u.getName() + ", " + u.getCity());
        }

    }
    public static List<User> Turn(Set<User> users){
        return users.stream().toList();
    }
    public static void DeleteUser(Set<User> users, int a){
        Iterator<User> iterator = users.iterator();
       while (iterator.hasNext()){
           int i = iterator.next().getId();
           if(i == a){
               iterator.remove();
           }


       }

    }
    public static Map<String, User> group(Set<User> users){
        Iterator<User> iterator = users.iterator();
        Map<String, User> userMap = new HashMap<>();
        while(iterator.hasNext()){
            userMap.put(iterator.next().getCity(), iterator.next());
        }
        return userMap;

    }
}
