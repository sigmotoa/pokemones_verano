package com.sigmotoa.pokemones

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.sigmotoa.pokemones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pokemonAdapter: PokemonAdapter
    private lateinit var linearLayoutManager: LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        pokemonAdapter = PokemonAdapter(getPokemons())
linearLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)

        binding.myrecyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = pokemonAdapter
        }

    }
}