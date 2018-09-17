package com.example.snapgroup7.whatsosyedapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CallsDataAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<CallsData> arrayList;

    public CallsDataAdapter(Context context, ArrayList<CallsData> arrayAdapter) {
        this.context = context;
        this.arrayList = arrayAdapter;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.calls_listview_contract,parent,false);
        }

        TextView contactName = (TextView)convertView.findViewById(R.id.CallsName);

        contactName.setText(arrayList.get(position).getContactName());

        return convertView;

    }
}
