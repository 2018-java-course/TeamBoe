/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beer;

/**
 *
 * @author PC17
 */
public class Participant extends Person {
    private int id;
    private static int idCounter = 0;

    //the participant has its own id that is unique for each instance
    public Participant() {
        updateID();
    }

    public Participant(String name, int age, double cash) {
        super(name, age, cash);
        updateID();
    }
    
    private void updateID(){
        idCounter++;
        id = idCounter;
    }

    @Override
    public void drink() {
    }
    
    public int getId(){
        return id;
    }

    @Override
    public void buyDrink() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
