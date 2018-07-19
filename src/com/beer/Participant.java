package com.beer;

/**
 *
 * @author PC17
 */

 //the participant has its own id that is unique for each instance
public class Participant extends Person {
    private int id;
    private static int idCounter = 0;

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

}
