package com.example.snapgroup7.whatsosyedapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_calls,container,false);

        final ListView callLV = (ListView)view.findViewById(R.id.callsLV);
        final ArrayList<CallsData> contactNamesArrayList = new ArrayList<>();
         contactNamesArrayList.add(new CallsData("osyed"));
         contactNamesArrayList.add(new CallsData("osyed"));
         contactNamesArrayList.add(new CallsData("osyed"));
         contactNamesArrayList.add(new CallsData("osyed"));

        return view;
    }

}
