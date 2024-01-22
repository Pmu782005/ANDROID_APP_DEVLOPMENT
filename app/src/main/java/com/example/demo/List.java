package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends AppCompatActivity {
    ListView Listview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Listview=findViewById(R.id.List1);
        String [] data={"BMW","FIAT","JAGUAR","TESLA","BMW","FIAT","JAGUAR","TESLA","BMW","FIAT","JAGUAR","TESLA"};
        Integer [] imgid={R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla,R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla,R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla};

    }
    public class customadapter extends ArrayAdapter<String>{

        public customadapter(@NonNull Context context, int resource) {
            super(context, resource);
        }
    }
}