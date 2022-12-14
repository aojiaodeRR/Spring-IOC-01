package com.aojiaodeRR.DI03;

public class Student {
    private String name ;
    private int age ;
//    声明引用
    private School school;

    public Student(String name, int age, School school) {
        System.out.println("===spring有参构造方法执行===");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }
    public void setSchool(School school) {
        this.school = school;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
