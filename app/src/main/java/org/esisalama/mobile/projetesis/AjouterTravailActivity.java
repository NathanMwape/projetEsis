package org.esisalama.mobile.projetesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class AjouterTravailActivity extends AppCompatActivity {

    private EditText editTextDescription;
    private EditText editTextPromotion;
    private EditText editTextCategorie;
    private EditText editTextDate;
    private Button buttonAjoutPhoto, buttonAjouterTravailModifie;
    private TextView textViewPhoto;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_travail);

        initialiserComposant();
        ecouteurEvenement();


    }

    private void initialiserComposant(){
        editTextDescription = findViewById(R.id.editTextDescription);
        editTextPromotion = findViewById(R.id.editTextPromotion);
        editTextCategorie = findViewById(R.id.editTextCategorie);
        editTextDate = findViewById(R.id.editTextDate);
        buttonAjoutPhoto = findViewById(R.id.btnAjoutePhoto);
        buttonAjouterTravailModifie= findViewById(R.id.btnAjouteTrav);
        progressBar = findViewById(R.id.progressBar);
    }

    private void ecouteurEvenement(){
        boutonAjouterElement();
        boutonAjouterPhoto();
    }

    private void boutonAjouterElement(){
        buttonAjouterTravailModifie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextDesc = editTextDescription.getText().toString();
                String editTextProm = editTextPromotion.getText().toString();
                String editTextCateg = editTextCategorie.getText().toString();
                String editTextDatT = editTextDate.getText().toString();

                if (editTextDesc.isEmpty() && editTextProm.isEmpty() && editTextCateg.isEmpty() && editTextDatT.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "Veiller renseigner tous Les champs ", Toast.LENGTH_LONG).show();
                }else if (editTextDesc.isEmpty()) {
                    Toast.makeText(AjouterTravailActivity.this, "Le champs description doit etre remplit", Toast.LENGTH_LONG).show();
                }else  if (editTextProm.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "Le champs Promotion doit etre remplit", Toast.LENGTH_LONG).show();
                }else  if (editTextCateg.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "Le champs Categorie doit etre remplit", Toast.LENGTH_LONG).show();
                }else  if (editTextDatT.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "Le champs Date doit etre remplit", Toast.LENGTH_LONG).show();
                } else {
                    Intent intentAjouterTavai = new Intent(AjouterTravailActivity.this, HomePageActivity.class);
                    startActivity(intentAjouterTavai);
                    finish();
                }
            }
        });
    }
    private void boutonAjouterPhoto(){
        buttonAjoutPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}