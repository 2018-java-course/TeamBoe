/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beer.utils;

import calendar.api.CalendarEvent;
import com.beer.*;
import java.util.ArrayList;

/**
 *
 * @author PC17
 */
public class BeerEventManager implements calendar.api.CalendarEventDatabase {

    private ArrayList<BeerEvent> events = new ArrayList<>();
    //private Scanner sc = new Scanner(System.in);

    private TextUtils txtUtils = TextUtils.getInstance();

    @Override
    public void populate(ArrayList<CalendarEvent> events) {
        int choice = 0;
        for (; choice <= 0 || choice >= 4;) {
            choice = choiceMenu();
        }

        //handling the various choices
        switch (choice) {
            case 1:
                addEvent();
                viewEvents();
                break;
            case 2:
                deleteEvent();
                break;
            case 3:
                viewEvents();
                break;
            default:
                System.out.println("Input not valid!");
        }

    }

    public void addEvent() {
        //TODO
        BeerEvent.Builder event = new BeerEvent.Builder();

        System.out.println("Input the tile of the event");
        event.setTitle(txtUtils.readString());
        System.out.println("Input the description of the event");
        event.setDescription(txtUtils.readString());
        System.out.println("Input the location of the event");
        event.setLocation(txtUtils.readString());
        System.out.println("Input the category");
        event.setCategory(txtUtils.readString());
        System.out.println("Input the start date");
        event.setStartDate(txtUtils.readDate());
        System.out.println("Input the end date");
        event.setEndDate(txtUtils.readDate());

        //builds the event and adds it to the list
        events.add(event.build());
    }

    public void addEvent(BeerEvent b) {
        if (events.contains(b)) {
            System.out.println("Event already present");
        } else {
            events.add(b);
        }
    }

    public void deleteEvent() {

    }

    private int choiceMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1)Add event");
        System.out.println("2)Delete event");
        System.out.println("3)View events");
        int choice = txtUtils.readInt();
        return choice;
    }

    public void viewEvents() {
        events.forEach(b -> System.out.println(b.toString()));
    }
}
