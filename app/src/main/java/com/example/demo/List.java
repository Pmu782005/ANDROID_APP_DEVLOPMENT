package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
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
        String [] data={"BMW","FIAT","JAGUAR","TESLA","BMW","FIAT","JAGUAR","TESLA","BMW","FIAT","JAGUAR","TESLA"};
        Integer [] imgid={R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla,R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla,R.drawable.bmw,R.drawable.fiat,R.drawable.jaguar,R.drawable.tesla};
        customadapter cursorAdapter = new customadapter(getApplicationContext(),data,imgid);
        Listview.setAdapter(cursorAdapter);
    }
    public class customadapter extends ArrayAdapter<String>{
        private final Context context;
        private final String[]data;
        private final Integer[]imgid;

        public customadapter(@NonNull Context context, String[]data,Integer[]imgid) {
            super(context, R.layout.customlist,data);
            this.context=context;
            this.data=data;
            this.imgid=imgid;
        }
        public View getView(int i, View convertview, ViewGroup viewGroup){
            View v1=getLayoutInflater().inflate(R.layout.customlist,viewGroup,true);
            ImageView img=v1.findViewById(R.id.image);
            TextView name=v1.findViewById(R.id.text);

            img.setImageResource(imgid[i]);
            name.setText(data[i]);

            return v1;

        }
    }
}