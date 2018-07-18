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

    
    public BeerEvent(){
        
    }

    public BeerEvent(String title, LocalDate startDate, LocalDate endDate, String category, String location) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.location = location;
    }
    
    
    
    //setters and getters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
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
