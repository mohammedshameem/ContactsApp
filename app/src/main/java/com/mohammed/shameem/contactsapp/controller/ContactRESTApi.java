package com.mohammed.shameem.contactsapp.controller;


import com.mohammed.shameem.contactsapp.model.Contacts;
import com.mohammed.shameem.contactsapp.model.ContactsBaseHolder;
import com.mohammed.shameem.contactsapp.model.Response;

import java.util.List;


import retrofit.Callback;
import retrofit.http.GET;


/**
 * Created by shameem on 6/11/2016.
 */
public interface ContactRESTApi {
    @GET("/contacts")
    void getData(Callback<List<Response> > contacts);


}
