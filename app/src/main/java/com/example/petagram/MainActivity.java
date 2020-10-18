package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos.add(newContacto("agus","151515"));
        for (Contacto contacto: contactos) {
            nombresContactos.add(contacto.getNombre());
        }

        ListView lstContactos = (ListView) findViewById(R.id.LstContactos);
        lstContactos.setAdapter(new ArrayAdapter<string>(this, androi.R.layout.simple_list_iterm_1,contactos));
    }
    lstContactos.setOnItemClickListener(AdapterView<?> parent,View view,int position,long id){
        Intent intent = new Intent(MainActivity.this, confirmacionDatos.class);
        intent.putExtra(getResources().getString(R.string.pname),contactos.get(position).getNombre());
        intent.putExtra(getResources().getString(R.string.pphone),contactos.get(position).getPhone());

        startActiviti(Intent);
    }
}