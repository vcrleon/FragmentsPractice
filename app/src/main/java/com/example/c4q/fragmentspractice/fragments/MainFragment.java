package com.example.c4q.fragmentspractice.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.c4q.fragmentspractice.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private View rootView;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        EditText editText = (EditText) rootView.findViewById(R.id.fragment_button_01);

        Button button01 = (Button) rootView.findViewById(R.id.fragment_button_01);
        Button button02 = (Button) rootView.findViewById(R.id.fragment_button_02);
        Button button03 = (Button) rootView.findViewById(R.id.fragment_button_03);
        Button button04 = (Button) rootView.findViewById(R.id.fragment_button_04);
        Button button05 = (Button) rootView.findViewById(R.id.fragment_button_05);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



        return rootView;
    }

}
