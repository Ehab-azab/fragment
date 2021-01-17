package com.example.mostafaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int number=0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout fragment=(FrameLayout)findViewById(R.id.fragment);
         tv=findViewById(R.id.tv);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment, new Myfragment());
        ft.commit();
    }
    public void increasenumber(){
        number+=1;
        Log.e("n",number+"");
        tv.setText( number+"");
    }
}