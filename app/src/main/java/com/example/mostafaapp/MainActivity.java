package com.example.mostafaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button tsbeh;
    int number2=0;
    Myfragment fragment = new Myfragment();
    Bundle bundle = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tsbeh=(Button) findViewById(R.id.ac_btn);
         tv=findViewById(R.id.tv);
tsbeh.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        trftrshData();
    }
});

        bundle.putInt("number2", number2);
        fragment.setArguments(bundle);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment, fragment);
        ft.commit();
    }
    public void increasenumber(int number){

        Log.e("n",number+"");
        tv.setText( number+"");
    }
    public void trftrshData(){
        number2+=1;
        bundle.putInt("number2", number2);
        fragment.setArguments(bundle);
        fragment.fun();
    }
}