package com.example.td2;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listView);

        // create data
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("AKTOR", "Chien", "Angleterre", R.drawable.item1));
        list.add(new Animal("DANKO", "Chien", "Allemagne", R.drawable.item2));
        list.add(new Animal("MAX", "Chien", "Croatie", R.drawable.item3));
        list.add(new Animal("LUCKY", "Chien", "Angleterre", R.drawable.item4));
        list.add(new Animal("OSCAR", "Chien", "France", R.drawable.item5));
        list.add(new Animal("JAZZ", "Chien", "Suisse", R.drawable.item6));

        MyAdapter adapter = new MyAdapter(list);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal animal = (Animal) parent.getItemAtPosition(position);

                System.out.println("******************************");
                System.out.println(position);
                System.out.println("******************************");

                // Intent instance animal to InfoActivity
                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                intent.putExtra("data", animal);
                startActivity(intent);
            }
        });

    }
}