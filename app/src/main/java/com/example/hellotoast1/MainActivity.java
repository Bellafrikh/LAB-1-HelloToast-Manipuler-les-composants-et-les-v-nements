package com.example.hellotoast1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // On utilise des noms de variables clairs en français
    private int scoreCompteur = 0;
    private TextView zoneAffichage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison avec le XML (on s'assure que les IDs correspondent)
        zoneAffichage = findViewById(R.id.show_count);
        Button boutonAlerte = findViewById(R.id.button_toast);
        Button boutonPlus = findViewById(R.id.button_count);

        // Action quand on clique sur le bouton "Message"
        boutonAlerte.setOnClickListener(v -> {
            // Un petit message sympa et personnalisé
            Toast.makeText(this, "Bravo ! Vous avez cliqué !", Toast.LENGTH_SHORT).show();
        });

        // Action quand on clique sur le bouton "Compter"
        boutonPlus.setOnClickListener(v -> {
            scoreCompteur++; // On ajoute 1

            // Mise à jour du texte à l'écran
            // Astuce : On concatène avec "" pour transformer le chiffre en texte simplement
            zoneAffichage.setText("" + scoreCompteur);
        });
    }
}