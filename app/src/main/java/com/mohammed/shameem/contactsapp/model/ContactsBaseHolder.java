package com.mohammed.shameem.contactsapp.model;

import java.io.Serializable;

/**
 * Created by shameem on 6/11/2016.
 */
public class ContactsBaseHolder implements Serializable {
    private Contacts[] contacts;

    public Contacts[] getContacts() {
        return contacts;
    }

    public void setContacts(Contacts[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "ClassPojo [contacts = " + contacts + "]";
    }

    }





