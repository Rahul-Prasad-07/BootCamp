package com.company.MusicLibrary.entites;

import java.util.Date;
//import java lombok // we have to download and then import.
// but gradle automatically download. and we can use it.maven and gradle are package manager or downloader
//@AllArgsConstructor // for generating constructor without writing it.


public class User {
    public static int counter=1;

    private int userId;
    private String firstName;
    private String lastName;
    private Address address;
    private Contact contact;

    private Date registrationTime;

    public static class Address {
        private String city;
        private String locality;
        private String state;
        private int pinCode;

        public Address(String city, String locality, String state, int pinCode) {
            this.city = city;
            this.locality = locality;
            this.state = state;
            this.pinCode = pinCode;
        }

        public Address(Address obj) {
            this.city = obj.city;
            this.locality = obj.locality;
            this.state = obj.state;
            this.pinCode = obj.pinCode;
        }

        public String getCity() {
            return city;
        }

        public String getLocality() {
            return locality;
        }

        public String getState() {
            return state;
        }

        public int getPinCode() {
            return pinCode;
        }
    }


    public static class Contact {
        private String emailId;
        private String phoneNo;

        public Contact(String emailId, String phoneNo) {
            this.emailId = emailId;
            this.phoneNo = phoneNo;
        }

        public Contact(Contact obj) {
            this.emailId = obj.emailId;
            this.phoneNo = obj.phoneNo;
        }

        public String getEmailId() {
            return emailId;
        }

        public String getPhoneNo() {
            return phoneNo;
        }
    }

    public User(String firstName, String lastName, Address address, Contact contact, Date registrationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.registrationTime = registrationTime;
        this.userId = counter;
        counter++;
    }


    public int getUserId() {
        return userId;
    }

    public String getName() {
        return firstName+" "+lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }
}

