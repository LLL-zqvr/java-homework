package com.example.test5;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

        private static final List<Student> STUDENTS = create();

        private static final String CLAZZ1 = "软件1班";

        private static final String CLAZZ2 = "软件2班";

        static List<Student> create() {

            Student s1 = new Student(2018008, "张扬", CLAZZ2, 66);

            Student s2 = new Student(2018005, "刘飞", CLAZZ1, 92);

            Student s3 = new Student(2018007, "李明", CLAZZ2, 42);

            Student s4 = new Student(2018006, "赵勇", CLAZZ2, 56);

            Student s5 = new Student(2018002, "王磊", CLAZZ1, 81);

            Student s6 = new Student(2018010, "牛娜", CLAZZ1, 78);

            List<Student> students = new ArrayList<>();

            students.add(s1);
            students.add(s2);
            students.add(s3);

            students.add(s4);
            students.add(s5);
            students.add(s6);

            return students;
        }
        /*
        public List<Student> studentList(){
            return create();
        }

         */
    }
