package com.example.snapgroup7.whatsosyedapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ContactNamesAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ContactNames> contactNamesArrayList;

    public ContactNamesAdapter(Context context, ArrayList<ContactNames> contactNamesArrayList) {
        this.context = context;
        this.contactNamesArrayList = contactNamesArrayList;
    }


    @Override
    public int getCount() {
        return contactNamesArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactNamesArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.chat_listview_contract,parent,false);
        }

        TextView contactGrOrPer =(TextView) convertView.findViewById(R.id.contentName);
        TextView senderName =(TextView) convertView.findViewById(R.id.nameSender);
        TextView lastMassage =(TextView) convertView.findViewById(R.id.lastChat);
        ImageView imageView =(ImageView) convertView.findViewById(R.id.profile_image);

        contactGrOrPer.setText(contactNamesArrayList.get(position).getContactGrOrPer());
        senderName.setText(contactNamesArrayList.get(position).getSenderName());
        lastMassage.setText(contactNamesArrayList.get(position).getLastMassage());

        Picasso.get().load(contactNamesArrayList.get(position).getImageUrl().toString()).into(imageView);

        return convertView;
    }
}
