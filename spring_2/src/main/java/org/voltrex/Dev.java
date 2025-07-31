package org.voltrex;

public class Dev {

//    public Dev(){
//        System.out.println("Creating Dev Object");
//    }

//    public Dev(int age) {
//        this.age = age;
//    }

//    int age;
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
// inject the value using spring

    Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Working on Dev class");
         laptop.compile();
    }
}
