package model.entity;

public class Record {
    private String surname;
    private String name;
    private String dateOfBirth;
    private String phoneNumber;

    //home address
    private String street;
    private String house;
    private String apartment;

    public Record() {}

    public Record(Record record) {
        this.surname = record.surname;
        this.name = record.name;
        this.dateOfBirth = record.dateOfBirth;
        this.phoneNumber = record.phoneNumber;
        this.street = record.street;
        this.house = record.house;
        this.apartment = record.apartment;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

        @Override
    public String toString() {
        return "surname = " + surname +
                ", name = " + name +
                ", dateOfBirth = " + dateOfBirth +
                ", phoneNumber = " + "+" + phoneNumber +
                ", street = " + street +
                ", house = " + house +
                ", apartment = " + apartment;
    }
}
