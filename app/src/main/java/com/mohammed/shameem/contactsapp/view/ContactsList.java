package com.mohammed.shameem.contactsapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.mohammed.shameem.contactsapp.R;
import com.mohammed.shameem.contactsapp.controller.ContactRESTApi;
import com.mohammed.shameem.contactsapp.controller.ContactsAdapter;
import com.mohammed.shameem.contactsapp.model.Contacts;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ContactsList extends AppCompatActivity {
    ListView contactList;
    List<Contacts> contactsBaseHolderList = new ArrayList<>();
    String BASE_URL = "http://api.androidhive.info/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_list);
        contactList = (ListView) findViewById(R.id.contactList);


        final RestAdapter restadapter = new RestAdapter.Builder().setEndpoint(BASE_URL).build();
        ContactRESTApi contactRESTApi = restadapter.create(ContactRESTApi.class);
        contactRESTApi.getData(new Callback<List<Contacts>>() {
            @Override
            public void success(List<Contacts> contactsBaseHolders, Response response) {
                contactsBaseHolderList=contactsBaseHolders;
                contactList.setAdapter(new ContactsAdapter(ContactsList.this,contactsBaseHolderList));
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }
}

