/*
the person participates at the event and can buy stuff
*/
package com.beer;

/**
 *
 * @author PC17
 */
public abstract class Person {
    private String name;
    private int age;
    private double cash;
    
    public Person(){
        cash = 0.0;
    }

    public Person(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }
    
    public boolean isAdult(){
        if(age < 18)
            return false;
        else return true;
    }
    
    public abstract void drink();
    
}
