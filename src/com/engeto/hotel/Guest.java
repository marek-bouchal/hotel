package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    ///region attributes
     private String firstName;
     private String surname;
     private LocalDate dateOfBirth;
     ///endregion

    ///region constructors
    public Guest(String firstName, String surname, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    ///endregion

    ///region getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    ///endregion
}
