package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class PersonalInfo {
    private String firstName;
    private String midName;
    private String lastName;
    private String dateOfBirth;
    private String nativeCity;
    private String address;
    private String phoneNumber;
    private String faculty;
    private String speciality;
    private String yearOfStudying;
    private String group;


    public PersonalInfo() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(String yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    public String getGroupNumber() {
        return group;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nativeCity='" + nativeCity + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", speciality='" + speciality + '\'' +
                ", yearOfStudying='" + yearOfStudying + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalInfo person = (PersonalInfo) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(midName, person.midName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && Objects.equals(nativeCity, person.nativeCity)  && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(faculty, person.faculty) && Objects.equals(speciality, person.speciality) && Objects.equals(group, person.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, midName, lastName, dateOfBirth, nativeCity,
                address, phoneNumber, faculty, speciality, yearOfStudying, group);
    }
}