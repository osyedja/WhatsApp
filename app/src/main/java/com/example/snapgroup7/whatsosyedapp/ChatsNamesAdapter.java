package com.example.snapgroup7.whatsosyedapp;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ChatsNamesAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ContactNames> contactNamesArrayList;

    public ChatsNamesAdapter(Context context, ArrayList<ContactNames> contactNamesArrayList) {
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
        Log.i("ImageUrl",contactNamesArrayList.get(position).getImageUrl().toString());
//        Picasso.with(context).load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg").error(R.drawable.ic_launcher_background)
//               .into(imageView);
        Glide.with(context).load(contactNamesArrayList.get(position).getImageUrl().toString()).into(imageView);


        return convertView;
    }
}
