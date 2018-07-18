package com.beer;
import calendar.api.*;
import java.util.ArrayList;
import com.beer.utils.BeerEventManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC17
 */
public class MainClass {
    public static void main(String[] args) {
        ArrayList<Participant> members = new ArrayList<>();

        Participant p = new Participant();
        Participant p1 = new Participant();
        Participant p2 = new Participant();
        Participant p3 = new Participant();
        members.add(p);
        members.add(p1);
        members.add(p2);
        members.add(p3);
        
        members.forEach(s -> System.out.println(s.getId()));
        
        BeerEventManager bManager = new BeerEventManager();
        ArrayList<BeerEvent> events = new ArrayList<>();
    }
    
    
}
