package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class confirmacionDatos extends AppCompatActivity {
    private TextView editTextTextPersonName ;
    private TextView editTextPhone ;
    private TextView editTextDetalle ;
    private TextView editTextTextEmailAddress ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.pname));
        String phone = parametros.getString(getResources().getString(R.string.pphone));
        editTextTextPersonName =(TextView) findViewById(R.id.editTextTextPersonName);
        editTextPhone =(TextView) findViewById(R.id.editTextPhone);
        editTextDetalle =(TextView) findViewById(R.id.editTextDetalle);
        editTextTextEmailAddress =(TextView) findViewById(R.id.editTextTextEmailAddress);


        editTextTextPersonName.setText(nombre);
        editTextPhone.setText(phone);

    }
    public void llamar(View v){
        String telefono = editTextPhone.getText().toString();
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+telefono)));
    }
    public void enviarMail(View v){
        String email = editTextTextEmailAddress.getText().toString();
        Intent emailIntent = new Intent((Intent.ACTION_SEND));
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL,email);
        emailIntent.setType("mesager/rfc822");
        startActivity(Intent.CreateChooser(emailIntent,"Email"));

    }
}