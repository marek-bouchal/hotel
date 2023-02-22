package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {
    ///region attributes
    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private BigDecimal pricePerNight;
    ///endregion

    ///region constructors
    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, boolean hasSeaView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }
    ///endregion

    ///region getters and setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    ///endregion
}
