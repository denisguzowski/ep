package controller.service;

import model.Journal;
import model.entity.Record;

public class JournalService {
    private Record record = new Record();
    private Journal model = new Journal();
    private byte dataIntegrity = 0b00000000;

    /*
    dataIntegrity = 0b00000001 - setSurname
    dataIntegrity = 0b00000010 - setName
    dataIntegrity = 0b00000100 - setDateOfBirth
    dataIntegrity = 0b00001000 - setPhoneNumber
    dataIntegrity = 0b00010000 - setStreet
    dataIntegrity = 0b00100000 - setHouse
    dataIntegrity = 0b01000000 - setApartment
    */

    public void setSurname(String surname) {
        byte surnameFlag = 0b00000001;
        record.setSurname(surname);
        dataIntegrity |= surnameFlag;
    }

    public void setName(String name) {
        byte nameFlag = 0b00000010;
        record.setName(name);
        dataIntegrity |= nameFlag;
    }

    public void setDateOfBirth(String dateOfBirth) {
        byte dateOfBirthFlag = 0b00000100;
        record.setDateOfBirth(dateOfBirth);
        dataIntegrity |= dateOfBirthFlag;
    }

    public void setPhoneNumber(String phoneNumber) {
        byte phoneNumberFlag = 0b00001000;
        record.setPhoneNumber(phoneNumber);
        dataIntegrity |= phoneNumberFlag;
    }

    public void setStreet(String street) {
        byte streetFlag = 0b00010000;
        record.setStreet(street);
        dataIntegrity |= streetFlag;
    }

    public void setHouse(String house) {
        byte houseFlag = 0b00100000;
        record.setHouse(house);
        dataIntegrity |= houseFlag;
    }

    public void setApartment(String apartment) {
        byte apartmentFlag = 0b01000000;
        record.setApartment(apartment);
        dataIntegrity |= apartmentFlag;
    }

    public boolean addRecord(){
        if(dataIntegrity == 0b01111111){ //all methods were invoked
            model.addRecord(new Record(record));
            dataIntegrity = 0b00000000;
            return true;
        }else {
            return false;
        }
    }

    public int getNumberOfRecords(){
        return model.getNumberOfRecords();
    }

    public String getJournalAsString(){
        return model.toString();
    }
}
