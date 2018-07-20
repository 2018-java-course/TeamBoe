package com.beer.utils;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import com.beer.*;
import java.util.ArrayList;

/**
 *
 * @author PC17
 */
public class BeerEventManager implements calendar.api.CalendarEventDatabase {

    private ArrayList<BeerEvent> events = new ArrayList<>();
    private TextUtils txtUtils = TextUtils.getInstance();

    @Override
    public void populate(ArrayList<CalendarEvent> events) {
        int choice = 0;
        for (; choice >= 0 && choice <= 3;) {
            choice = choiceMenu();
            //handling the various choices
            switch (choice) {
                case 0:
                    System.out.println("Goodbye..");
                    choice = -1;
                    break;
                case 1:
                    addEvent();
                    break;
                case 2:
                    deleteEvent();
                    break;
                case 3:
                    viewEvents();
                    break;
                default:
                    System.out.println("Input not valid!");
                    choice = 0;
            }
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
            System.out.println("Event already present!");
        } else {
            events.add(b);
        }
    }

    public void deleteEvent() {
        viewEvents();
        System.out.println("Input the name of the event to delete");
        final String name = txtUtils.readString();
        System.out.println("Input the location of the event do delete");
        final String location = txtUtils.readString();

        //checks if the event exists and deletes it from the list
        boolean remove = events.removeIf(e -> {
            try {
                return e.getTitle().equals(name) && e.getLocation().equals(location);
            } catch (CalendarEventException ex) {
                return false;
            }
        });
        if (remove) {
            System.out.println("Event removed!");
        } else {
            System.out.println("Nothing to remove!");
        }
        viewEvents();

    }

    private int choiceMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1)Add event");
        System.out.println("2)Delete event");
        System.out.println("3)View events");
        System.out.println("0)Exit");
        int choice = txtUtils.readInt();
        return choice;
    }

    public void viewEvents() {
        System.out.println("\n#######Events#######");
        events.forEach(b -> System.out.println(b.toString()));
        System.out.println("#######End#######\n");
    }
}
