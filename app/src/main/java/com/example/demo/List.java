package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends AppCompatActivity {
    ListView Listview;
    String name[]={"python","DSA","C","JAVA","python","DSA","C","JAVA"
            ,"python","DSA","C","JAVA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Listview=findViewById(R.id.List1);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);
        Listview.setAdapter(arrayAdapter);

    }
}