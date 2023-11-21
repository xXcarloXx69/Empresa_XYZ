package com.example.empresa_xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_seleccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_seleccion);
    }
    public void listaPrincipal(View view){
        Intent i = new Intent(this, listaPrincipal.class);
        startActivity(i);
    }
    public void MQTT(View view){
        Intent i = new Intent(this, menu_seleccion.class);
        startActivity(i);
    }



}