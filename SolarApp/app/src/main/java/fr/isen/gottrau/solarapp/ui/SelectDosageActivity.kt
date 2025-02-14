package fr.isen.gottrau.solarapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import fr.isen.gottrau.solarapp.R

class SelectDosageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_dosage)

        val selectedCreamText = findViewById<TextView>(R.id.selectedCreamText)
        val faceButton = findViewById<Button>(R.id.faceButton)
        val fullBodyButton = findViewById<Button>(R.id.fullBodyButton)

        // Récupérer le type de crème choisi
        val creamType = intent.getStringExtra("creamType") ?: "Inconnu"
        selectedCreamText.text = "Vous avez choisi : Crème $creamType"

        faceButton.setOnClickListener {
            Toast.makeText(this, "Crème $creamType appliquée sur le visage", Toast.LENGTH_SHORT).show()
        }

        fullBodyButton.setOnClickListener {
            Toast.makeText(this, "Crème $creamType appliquée sur tout le corps", Toast.LENGTH_SHORT).show()
        }
    }
}
