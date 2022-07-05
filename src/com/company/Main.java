package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        try {
            Student student1 = new Student("Name1", 24);
            Student student2 = new Student();
            Student student3 = new Student("Name3", 4);
            Student student4 = new Student("Name4", 14);
            student2.setName("Name2");
            student2.setAge(-1);

            array.add(student1);
            array.add(student2);
            array.add(student3);
            array.add(student4);
            System.out.println(array.toString());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
        finally {
            System.out.println("End");
        }
    }
}
