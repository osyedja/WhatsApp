package com.example.snapgroup7.whatsosyedapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChatsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats,container,false);

        final ListView listView = (ListView)view.findViewById(R.id.chatsLV);
        final ArrayList<ContactNames> contactNamesArrayList = new ArrayList<ContactNames>();
        contactNamesArrayList.add(new ContactNames("dad","osyed","https://www.attractivepartners.co.uk/wp-content/uploads/2017/06/profile.jpg","okey"));

        ContactNamesAdapter adapter = new ContactNamesAdapter(getActivity(),contactNamesArrayList);
        listView.setAdapter(adapter);


        return view;

    }
}
