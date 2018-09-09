package com.example.profesor.ejemploslayouts;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Ir sustituyendo aquí cada id de fichero de recurso layout a mostar
        setContentView(R.layout.ejemplo_relative_layout);
    }
}
