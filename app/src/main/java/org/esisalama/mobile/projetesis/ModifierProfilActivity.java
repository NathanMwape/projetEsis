package org.esisalama.mobile.projetesis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ModifierProfilActivity extends AppCompatActivity {

    private EditText editTextAncienM;
    private EditText editTextNouveauM;
    private EditText editTextConfirmM;
    private Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profil);
        initialiserChamp();
        confirmerPassword();
    }
    
    private void initialiserChamp(){
        editTextAncienM = findViewById(R.id.editTextAncien);
        editTextNouveauM = findViewById(R.id.editTextNouveau);
        editTextConfirmM = findViewById(R.id.editTextConfirme);
        buttonSubmit = findViewById(R.id.btnSubmit);
    }
    
    private void confirmerPassword(){
        
        String ancien = editTextAncienM.getText().toString();
        String nouveau = editTextNouveauM.getText().toString();
        String confirmer = editTextConfirmM.getText().toString();
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == null) {
                    
                }
            }
        });
    }
}