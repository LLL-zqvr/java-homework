package com.example.test5;

import com.example.test1.User;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

    }
    //获取成绩小于等于指定分数x，的全部学生
    public static List<Student> stuName(List<Student> list, int x){
        return StreamTest.create()
                .stream()
                .filter(a -> a.getScore() <= x)
                .toList();
    }
    public static List<Student> stuGroupByClassAndGrade(List<Student> list, String cla, int score){
        return StreamTest.create()
                .stream()
                .filter(a -> a.getClazz().equals(cla))
                .filter(a -> a.getScore() <= score)
                .toList();
    }
    public static List<String> stuGroupByClazzAndScore(List<Student>list, String calzz, int score){
        return StreamTest.create()
                .stream()
                .filter(a -> a.getClazz().equals(calzz))
                .filter(a -> a.getScore() <= score)
                .map(Student::getName)
                .collect(Collectors.toList());
    }
    public static List<Student> stuGroupByScore(List<Student> list){
        return StreamTest.create()
                .stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .toList();
    }
    public static List<Student> stuGroupByClazzAndScoreSore(List<Student> list, String clazz, int score){
        return StreamTest.create()
                .stream()
                .filter(a -> a.getClazz().equals(clazz))
                .filter(a -> a.getScore() <= score)
                .sorted(Comparator.comparing(Student::getScore))
                .toList();
    }
    public static List<Integer> stuGroupByClazzAndScoreAndGrade(List<Student> list, String clazz, int score){
        return StreamTest.create()
                .stream()
                .filter(a -> a.getClazz().equals(clazz))
                .filter(a -> a.getScore() <= score)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getNumber)
                .collect(Collectors.toList());
    }
}
/*public static Map<String, Student> group(List<Student> list){
    Iterator<Student> iterator = list.iterator();
    Map<Iterator, Student> studentMap = new HashMap<>();
    while(iterator.hasNext()){
        studentMap.put(iterator.next().getNumber(), iterator.next());
    }
    return studentMap;

 */