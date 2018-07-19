package com.beer;

import calendar.api.CalendarEventException;
import java.time.LocalDate;

/**
 *
 * @author PC17
 */
public class BeerEvent implements calendar.api.CalendarEvent, calendar.api.Displayable {

    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private String category;
    private String location;
    private String description;

    private BeerEvent() {
    }

//    public BeerEvent(String title, LocalDate startDate, LocalDate endDate, String category, String location) {
//        this.title = title;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.category = category;
//        this.location = location;
//    }
    //implementing the BuilderPattern design
    public static class Builder {

        private BeerEvent event;

        public Builder() {
            this.event = new BeerEvent();
        }

        public Builder setTitle(String title) {
            this.event.title = title;
            return this;
        }

        public Builder setStartDate(LocalDate startDate) {
            this.event.startDate = startDate;
            return this;
        }

        public Builder setEndDate(LocalDate endDate) {
            this.event.endDate = endDate;
            return this;
        }

        public Builder setCategory(String category) {
            this.event.category = category;
            return this;
        }

        public Builder setLocation(String location) {
            this.event.location = location;
            return this;
        }

        public Builder setDescription(String description) {
            this.event.description = description;
            return this;
        }

        public BeerEvent build() {
            return this.event;
        }
    }

    //getters
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

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BeerEvent{" + "title=" + title + ", startDate=" + startDate
                + ", endDate=" + endDate + ", category=" + category
                + ", location=" + location + ", description=" + description + '}';
    }
}
