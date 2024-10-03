package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Grocery grocery = new Grocery();
        //grocery.startGrocery();

        MobilePhone mobilePhone = new MobilePhone("123456", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("cansu", "456789"));
        mobilePhone.addNewContact(new Contact("cansu", "456789"));
        mobilePhone.addNewContact(new Contact("cansu", "456789"));
        mobilePhone.addNewContact(new Contact("cansu", "456789"));

        mobilePhone.printContact();
    }
}
