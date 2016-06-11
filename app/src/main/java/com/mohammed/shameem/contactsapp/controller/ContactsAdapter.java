package com.mohammed.shameem.contactsapp.controller;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mohammed.shameem.contactsapp.R;
import com.mohammed.shameem.contactsapp.model.ContactsBaseHolder;

import java.util.List;

/**
 * Created by shameem on 6/11/2016.
 */
public class ContactsAdapter extends BaseAdapter {
    Context context;
    List<ContactsBaseHolder> contactsList;
    LayoutInflater inflater;


    public ContactsAdapter(Activity activity, List<ContactsBaseHolder> contactsList) {
        this.context = activity;
        this.contactsList = contactsList;
        inflater = LayoutInflater.from(this.context);


    }




    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return contactsList.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public ContactsBaseHolder getItem(int position) {
        return contactsList.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootLayoutView = convertView;
        ViewHolder viewHolder;
        if (rootLayoutView == null) {
            rootLayoutView =  inflater.inflate(R.layout.contact_list_item, parent, false);;
            viewHolder = new ViewHolder(rootLayoutView);
            rootLayoutView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rootLayoutView.getTag();

        }
        ContactsBaseHolder contactsBaseHolder = getItem(position);
        viewHolder.textViewContactName.setText(contactsList.get(position).getContacts().)
        viewHolder.textViewContactEmailAddress.setText(c);
        viewHolder.textViewContactPhoneNumber.setText();


        return rootLayoutView;
    }

    public class ViewHolder {
        TextView textViewContactName, textViewContactEmailAddress, textViewContactPhoneNumber;

        public ViewHolder(View view) {
            textViewContactName = (TextView) view.findViewById(R.id.textViewContactName);
            textViewContactEmailAddress = (TextView) view.findViewById(R.id.textViewContactEmailAddress);
            textViewContactPhoneNumber = (TextView) view.findViewById(R.id.textViewContactPhoneNumber);
        }
    }
}
