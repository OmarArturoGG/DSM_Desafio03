package com.example.elDesafio03.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.elDesafio03.R
import com.example.elDesafio03.adapter.RegionsAdapter
import com.example.elDesafio03.controller.CountriesController

class MainActivity : AppCompatActivity() {

    private val countriesController = CountriesController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_region)


        val recyclerView = findViewById<RecyclerView>(R.id.regionsRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)


        val regions = listOf("Africa", "Asia", "Europe", "Americas", "Oceania")


        val regionsAdapter = RegionsAdapter(regions) { region ->
            val intent = Intent(this, CountriesActivity::class.java)
            intent.putExtra("REGION", region)
            startActivity(intent)
        }


        recyclerView.adapter = regionsAdapter
    }
}
