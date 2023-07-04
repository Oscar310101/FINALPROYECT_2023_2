package com.example.finalproyect2023_2.ACTIVITIES

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.finalproyect2023_2.ENTITIES.JobOffer
import com.example.finalproyect2023_2.R



class DetailOffersActivity : AppCompatActivity() {
    private lateinit var tituloTextView: TextView
    private lateinit var descripcionTextView: TextView
    private lateinit var postularButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_offers)

        // Obtener referencias de los elementos de la interfaz de usuario
        tituloTextView = findViewById(R.id.tituloTextView)
        descripcionTextView = findViewById(R.id.descripcionTextView)
        postularButton = findViewById(R.id.postularButton)

        // Obtener el índice de la oferta seleccionada desde el intent
        val indiceOferta = intent.getIntExtra("indice_oferta", -1)

        // Obtener la oferta correspondiente al índice
        val oferta = obtenerOfertaPorIndice(indiceOferta)

        // Mostrar los detalles de la oferta en los TextView
        tituloTextView.text = oferta.title
        descripcionTextView.text = oferta.description

        // Configurar el clic del botón de postulación
        postularButton.setOnClickListener {
            // Lógica para postularse a la oferta
            // ...
        }
    }

    private fun obtenerOfertaPorIndice(indice: Int): JobOffer{
        // Aquí debes implementar la lógica para obtener la oferta correspondiente al índice
        // Puede ser a través de una lista de ofertas o de una base de datos, por ejemplo
        // Por simplicidad, aquí se retorna una oferta ficticia
        return JobOffer("Título de la oferta $indice", "Descripción de la oferta $indice")
    }
}
