package com.example.td2;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InfoActivity extends AppCompatActivity {

    private TextView nom;
    private TextView descript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        nom = findViewById(R.id.animalName);
        descript = findViewById(R.id.description);

        @Deprecated
        Animal animal = (Animal) intent.getSerializableExtra("data");
        nom.setText(animal.getNom());

        if (animal.getNom().equals("AKTOR")) {
            descript.setText(R.string.AKTOR);
        } else if (animal.getNom().equals("DANKO")) {
            descript.setText(R.string.DANKO);
        } else if (animal.getNom().equals("MAX")) {
            descript.setText(R.string.MAX);
        } else if (animal.getNom().equals("LUCKY")) {
            descript.setText(R.string.LUCKY);
        } else if (animal.getNom().equals("OSCAR")) {
            descript.setText(R.string.OSCAR);
        } else if (animal.getNom().equals("JAZZ")) {
            descript.setText(R.string.JAZZ);
        } else {
            descript.setText("Pas de description");
        }


    }
}