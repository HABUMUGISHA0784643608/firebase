package com.example.myfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView etlist;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_new );

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_new, mobileArray);

        ListView listView = (ListView) findViewById(R.id.etist);
        listView.setAdapter(adapter);

    }
}