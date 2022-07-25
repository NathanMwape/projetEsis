package org.esisalama.mobile.projetesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        getSupportActionBar().setTitle("Home");

        verifierSession();
        configurerButtonProfils();
        configurerButtonAjout();
        configurerButtonListeTravail();
    }


    private void verifierSession(){
        //cereation de la Preference(session)
        // session represente le fichier
        SharedPreferences session = getSharedPreferences("session", 0);

        boolean sessionActive = session.getBoolean("session_active",false);


        if (!sessionActive){
            Intent login = new Intent(this,LoginActivity.class);
            startActivity(login);
            finish();
        }
    }

    private void configurerButtonListeTravail() {
        Button listBouton = findViewById(R.id.boutonListDoc);
        listBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listIntent = new Intent(HomePageActivity.this,ListeTravailActivity.class);
                startActivity(listIntent);
            }
        });
    }
    private void configurerButtonProfils(){
        Button boutonProfil = findViewById(R.id.boutonProfil);
        boutonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilsIntent = new Intent(HomePageActivity.this,ProfilActivity.class);
                startActivity(profilsIntent);
            }
        });
    }
    private void configurerButtonAjout(){
        Button boutonAjout = findViewById(R.id.bouttonAjoutDoc);
        boutonAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajoutIntent = new Intent(HomePageActivity.this,AjouterTravailActivity.class);
                startActivity(ajoutIntent);
            }
        });
    }


}