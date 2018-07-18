/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beer.utils;

import calendar.api.CalendarEvent;
import com.beer.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC17
 */
public class BeerEventManager implements calendar.api.CalendarEventDatabase {
    private ArrayList<BeerEvent> events = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void populate(ArrayList<CalendarEvent> events) {
        int choice = 0;
        for(;choice <=0 && choice >= 4;)
            choice = choiceMenu();
        
        switch(choice){
            case 1:
                addEvent();
        }
    }
    
    public void addEvent(){
        //TODO
        BeerEvent b = new BeerEvent();
        addEvent(b);
    }
    public void addEvent(BeerEvent b){
        events.add(b);
    }
    
    private int choiceMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1)Add event");
        System.out.println("2)Delete event");
        System.out.println("3)View events");
        int choice = sc.nextInt();
        return choice;
    }
}
