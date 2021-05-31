package com.addressbookjdbc;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class AddressBookData {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNo;
    String email;
    LocalDate dateAdded;


    public AddressBookData(String firstName, String lastName, String address, String city, String state, int zip, int phoneNo,
                           String email, LocalDate dateAdded) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
        this.dateAdded = dateAdded;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBookData)) return false;
        AddressBookData that = (AddressBookData) o;
        return getZip() == that.getZip() && getPhoneNo() == that.getPhoneNo() && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getState(), that.getState()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getDateAdded(), that.getDateAdded());
    }

    @Override
    public int hashCode() {
        return 0;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        AddressBookData other = (AddressBookData) obj;
//        if (address == null) {
//            if (other.address != null)
//                return false;
//        } else if (!address.equals(other.address))
//            return false;
//        if (city == null) {
//            if (other.city != null)
//                return false;
//        } else if (!city.equals(other.city))
//            return false;
//        if (email == null) {
//            if (other.email != null)
//                return false;
//        } else if (!email.equals(other.email))
//            return false;
//        if (firstName == null) {
//            if (other.firstName != null)
//                return false;
//        } else if (!firstName.equals(other.firstName))
//            return false;
//        if (lastName == null) {
//            if (other.lastName != null)
//                return false;
//        } else if (!lastName.equals(other.lastName))
//            return false;
//        if (phoneNo == null) {
//            if (other.phoneNo != null)
//                return false;
//        } else if (!phoneNo.equals(other.phoneNo))
//            return false;
//        if (state == null) {
//            if (other.state != null)
//                return false;
//        } else if (!state.equals(other.state))
//            return false;
//        if (zip == null) {
//            if (other.zip != null)
//                return false;
//        } else if (!zip.equals(other.zip))
//            return false;
//        return true;
//    }
}
