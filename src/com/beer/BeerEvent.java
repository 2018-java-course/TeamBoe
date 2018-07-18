package com.beer;


import calendar.api.CalendarEventException;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC17
 */
public class BeerEvent implements calendar.api.CalendarEvent{
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private String category;
    private String location;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getLocation() throws CalendarEventException {
        return location;
    }
    
}
