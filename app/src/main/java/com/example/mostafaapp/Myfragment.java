package com.example.mostafaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//
//my fragment  
// Created by Ehab Azab on 1/17/2021.
//
public class Myfragment extends Fragment {
    int number=0;
    int myInt;
    TextView tvbox;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.my_fragment,container,false) ;

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvbox=(TextView) view.findViewById(R.id.f_tv);
        Button mybtn=(Button) view.findViewById(R.id.btn);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number+=1;
                ((MainActivity)getActivity()).increasenumber( number);
            }
        });


    }
    public void fun(){
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            myInt = bundle.getInt("number2", 0);
        }
        tvbox.setText(myInt+"");
    }
}

