package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {
    ///region attributes
    Room room;
    Guest guest;
    LocalDate startDate;
    LocalDate endDate;
    ///endregion

    ///region constructors
    public Booking (Room room, Guest guest, LocalDate startDate, LocalDate endDate) {
    this.room = room;
    this.guest = guest;
    this.startDate = startDate;
    this.endDate = endDate;
    }
    ///endregion

    ///region getters and setters
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    ///endregion
}
