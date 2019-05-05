/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsAgenda;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contact implements Serializable {

    public String firstName;
    public String lastName;
    public String date;
    public PhNumber phoneNumberObj;

    //constructor contains the restrictions
    public Contact(String firstName, String lastName, String date, String phoneNumber) throws Exception {
        if (firstName.matches("[A-Z,a-z]+.*[A-Z,a-z]+")) {

            this.firstName = firstName;
        } else {
            throw new Exception("invalid firstName!");
        }

        if (lastName.matches("[A-Z,a-z]+.*[A-Z,a-z]+")) {
            this.lastName = lastName;
        } else {
            throw new Exception("invalid lastName!");
        }

        if (DateValidation.verifyDateFormat(date) && date.length() < 11) {
            this.date = date;
        } else {
            throw new Exception("invalid date!");
        }

        if (phoneNumber.matches("^[02,03]{2}[0-9]\\d{7}")) {
            this.phoneNumberObj = new PhHomeNumber(phoneNumber);
        } else if (phoneNumber.matches("^[07]{2}[0-9]\\d{7}")) {
            this.phoneNumberObj = new PhMobileNumber(phoneNumber);
        } else {
            throw new Exception("invalid phone number!");
        }

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + date + ", " + this.phoneNumberObj.phoneNumber + ";";
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getBirthDate() {
        try {
            return DateValidation.stringToDate(date);
        } catch (Exception ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date date = new Date();
        return date;
    }

    public String getPhoneNumber() {
        return phoneNumberObj.phoneNumber;
    }

    public boolean equals(Contact c) {
//        System.out.println("Compare: " + this.toString());
//        System.out.println(" with    " + c.toString());
        if (this.firstName.toLowerCase().equals(c.firstName.toLowerCase())
                && this.lastName.toLowerCase().equals(c.lastName.toLowerCase())
                && this.date.equals(c.date)
                && this.phoneNumberObj.phoneNumber.toString().equals(c.phoneNumberObj.phoneNumber.toString())) {
            System.out.println("Same contact!");
            return true;
        }
        return false;

    }

    public static Comparator<Contact> afterLastName = (c1, c2) -> c1.getLastName().compareTo(c2.getLastName());
    public static Comparator<Contact> afterFirstName = (c1, c2) -> c1.getFirstName().compareTo(c2.getFirstName());
    public static Comparator<Contact> afterBirthDate = (c1, c2) -> c1.getBirthDate().compareTo(c2.getBirthDate());
    public static Comparator<Contact> afterNumber = (c1, c2) -> c1.getPhoneNumber().compareTo(c2.getPhoneNumber());

}
