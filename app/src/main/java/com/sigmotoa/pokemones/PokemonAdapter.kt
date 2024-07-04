package com.sigmotoa.pokemones

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sigmotoa.pokemones.databinding.PokemonItemBinding

/**
 *
 * Created by sigmotoa on 4/07/24.
 * @author sigmotoa
 *
 * www.sigmotoa.com
 */
class PokemonAdapter(private val pokemonList: List<Pokemon>): RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {
   private lateinit var context:Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
       context=parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.pokemon_item, parent, false)
        return PokemonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = pokemonList[position]

        with(holder){
            binding.tvPokemonName.text=pokemon.pokemonName
            binding.tvPokemonNumber.text= pokemon.pokemonNumber.toString()
            //binding.imgPokemon.text=pokemon.pokemonImage
        }
    }

    inner class PokemonViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val binding= PokemonItemBinding.bind(view)
    }
}
