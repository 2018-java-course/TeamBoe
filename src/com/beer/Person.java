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
    
    public abstract void drink();
    public abstract void buyDrink();
    
    public boolean isAdult(){
        if(age < 18)
            return false;
        else return true;
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

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
    
    
    
    
}
