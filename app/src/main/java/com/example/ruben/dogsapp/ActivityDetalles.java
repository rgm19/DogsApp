package com.example.ruben.dogsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ActivityDetalles extends AppCompatActivity {

    static Dog dogie = new Dog();
    ImageView img_detalles;
    TextView descripcion , comportamiento, origen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        img_detalles=findViewById(R.id.img_detalles);
        Picasso.with(this).load(dogie.getUrl()).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).into(img_detalles);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(dogie.getName());
        }

        descripcion = findViewById(R.id.detalles_descripcion);
        descripcion.setText(dogie.getDescripcion());
        comportamiento = findViewById(R.id.detalles_comportamiento);
        comportamiento.setText(dogie.getComportamiento());
        origen = findViewById(R.id.detalles_origen);
        origen.setText(dogie.getOrigen());

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}
