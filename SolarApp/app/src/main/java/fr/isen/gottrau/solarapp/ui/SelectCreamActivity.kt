package fr.isen.gottrau.solarapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import fr.isen.gottrau.solarapp.R

class SelectCreamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_cream)

        val creamAButton = findViewById<Button>(R.id.creamAButton)
        val creamBButton = findViewById<Button>(R.id.creamBButton)

        creamAButton.setOnClickListener {
            val intent = Intent(this, SelectDosageActivity::class.java)
            intent.putExtra("creamType", "A")
            startActivity(intent)
        }

        creamBButton.setOnClickListener {
            val intent = Intent(this, SelectDosageActivity::class.java)
            intent.putExtra("creamType", "B")
            startActivity(intent)
        }
    }
}
