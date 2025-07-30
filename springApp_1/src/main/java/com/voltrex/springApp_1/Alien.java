package com.voltrex.springApp_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    // @Autowired // field injection
    Laptop laptop;
    // using @component it create the object
    // but using @autowired it connect Alien and laptop

    // Constructor Injection
    // public Alien(Laptop laptop){
    //    this.laptop = laptop;
    // }

    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  // Setter Injection

    public void build(){
        laptop.compile();
        System.out.println("Working on project");
    }
}
