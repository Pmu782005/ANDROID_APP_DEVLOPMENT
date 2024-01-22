package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class List extends AppCompatActivity {
    ListView Listview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Listview=findViewById(R.id.List1);
        String [] name={"BMW","FIAT","JAGUAR","TESLA","BMW","FIAT","JAGUAR","TESLA","BMW","FIAT","JAGUAR","TESLA"};
        Integer [] img={R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla,R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla,R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla};

        MyListAdapter adapter = new MyListAdapter(this,name,img);
        Listview.setAdapter(adapter);
    }
    public class MyListAdapter extends ArrayAdapter<String>{
        private final Activity context;
        private final String[] name;
        private final Integer[] img;

        public MyListAdapter(@NonNull Activity context, String[] name,Integer[] img) {
            super(context, R.layout.customlist,name);
            this.context=context;
            this.img=img;
            this.name=name;
        }
        public View getView(int position, View view, ViewGroup parent){
            LayoutInflater inflater=context.getLayoutInflater();
            View v1=inflater.inflate(R.layout.customlist,null,true);
            ImageView imageView=(ImageView) v1.findViewById(R.id.image);
            TextView titleText=(TextView) v1.findViewById(R.id.text);

            titleText.setText(name[position]);
            imageView.setImageResource(img[position]);

            return v1;

        };
    }
}