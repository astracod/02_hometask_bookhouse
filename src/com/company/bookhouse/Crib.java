package com.company.bookhouse;
import java.util.ArrayList;
import java.util.Scanner;
public class Crib <ElemType>{

//    class MyArray {
        private Object arr[];
        private int size = 0;
        private int capacity = 8;

        public Crib() {
            this.arr = new Object[capacity];
        }

        public void add(ElemType elem) {
            if(size>=capacity){
                capacity*=2;
                Object[] buf = new Object[capacity];
                for (int i = 0; i < arr.length; i++) {
                    buf[i] = arr[i];
                }
                arr = buf;
            }
            arr[size] = elem;
            size++;
        }

        public int size(){
            return this.size;
        }

        public ElemType get(int index) {
            return (ElemType) arr[index];
        }

        public void set(int index, ElemType value) {
            arr[index]=value;
        }
    }

    class Human{
        String name;
        int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayAbout(){
            System.out.println(name+" "+age);
        }

        public boolean gretter(int age) {
            return this.age>age;
        }
    }


    class School{
        ArrayList<Human> students;

        public School() {
            students = new ArrayList<>();
            students.add(new Human("vasia",15));
            students.add(new Human("egor",16));
            students.add(new Human("petia",14));
            students.add(new Human("viktor",14));
        }

        public void addStudent(Human student){
            students.add(student);
        }

        public ArrayList<Human> getStudentWithAgeGretter(int age) {
            ArrayList<Human> humans = new ArrayList<>();
            for (int i = 0; i < students.size(); i++) {
                if(students.get(i).gretter(age)){
                    humans.add(students.get(i));
                }
            }
            return humans;
        }
    }

//    public class Main {


/*        public static void main(String[] args) {


            School school = new School();
            school.addStudent(new Human("ivan",13));

            ArrayList<Human> s = school.getStudentWithAgeGretter(14);
            for (int i = 0; i < s.size(); i++) {
                s.get(i).sayAbout();
            }

        }*/
//    }

