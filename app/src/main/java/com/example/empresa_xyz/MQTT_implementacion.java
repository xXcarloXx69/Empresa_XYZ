package com.example.empresa_xyz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class MQTT_implementacion extends AppCompatActivity {

    static String MQTTHOST = "tcp://crudfirebase2.cloud.shiftr.io:1883";
    static String MQTTUSER = "crudfirebase2";
    static String MQTTPASS = "FoHA1vUkPUoQt1Qi";
    Boolean permisoPublicar;
    String clienteID = "";
    DatabaseReference databaseReference;
    ValueEventListener eventListener;
    RecyclerView recyclerView;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mqtt_implementacion);
    }
}