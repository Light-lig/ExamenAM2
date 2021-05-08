package com.example.examenparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuoverflow,menu);
        return true;
    }
    //Metodo ara los item del menu
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        //Obtener el item seleccionado
        int id = item.getItemId();

        if (id == R.id.miIntegrantes) {
            Intent integrantes = new Intent(MainActivity.this,Integrantes.class );
            startActivity(integrantes);
        }

        return super.onOptionsItemSelected(item);
    }
}