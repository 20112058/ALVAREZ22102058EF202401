package com.example.alvarez22102058ef202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alvarez22102058ef202401.model.TeamModel
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    private lateinit var etNombreTeam: EditText
    private lateinit var etUrlEscudo: EditText
    private lateinit var btGuardar: Button
    private lateinit var btRegEnfr: Button
    private lateinit var btListEnfr: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etNombreTeam = findViewById(R.id.etNombreTeam)
        etUrlEscudo = findViewById(R.id.etUrlEscudo)
        btGuardar = findViewById(R.id.btGuardar)
        btRegEnfr = findViewById(R.id.btActRegEnfr)
        btListEnfr = findViewById(R.id.btActListEnfr)

        btGuardar.setOnClickListener {
            addTeam()
        }

       /* btRegEnfr.setOnClickListener {
            val intent = Intent(requireContext(), RegEnfrenActivity::class.java)
            startActivity(intent)
        }*/

    }



    private fun addTeam(){
        val name = etNombreTeam.text.toString()
        val escudo = etUrlEscudo.text.toString()


        if (name.isEmpty() || escudo.isEmpty()) {
            Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            return
        }

        val teams = TeamModel(
            name = name,
            escudo = escudo
        )

        val db = FirebaseFirestore.getInstance()

        db.collection("team")
            .add(teams)
            .addOnSuccessListener {
                Toast.makeText(this, "Equipo guardado", Toast.LENGTH_SHORT).show()
                limpiarCampos()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Error al guardar equipo: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    private fun limpiarCampos() {
        etNombreTeam.text.clear()
        etUrlEscudo.text.clear()

    }
}