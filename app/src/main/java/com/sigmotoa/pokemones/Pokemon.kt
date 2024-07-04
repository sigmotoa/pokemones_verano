package com.sigmotoa.pokemones

data class Pokemon(val pokemonName: String, val pokemonImage: String?, val pokemonNumber:Int)

fun getPokemons():List<Pokemon>
{
    var pokemonList = mutableListOf <Pokemon>()

    val pk1 = Pokemon("Dragonite", pokemonNumber = 149, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/149.png")
    val pk2 = Pokemon("Mewtwo", pokemonNumber = 150, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png")
    val pk3 = Pokemon("Moltres", pokemonNumber = 146, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/146.png")
    val pk4 = Pokemon("Mew", pokemonNumber = 151, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/151.png")
    val pk5 = Pokemon("Moltres", pokemonNumber = 146, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/146.png")
    val pk6 = Pokemon( "Charizard", pokemonNumber = 6, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png")

    //create 10 more pokemons
    //val pk6 = Pokemon( "Charizard", pokemonNumber = 6, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png")


    val pk7 = Pokemon( "Charizard", pokemonNumber = 6, pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png")




    pokemonList.add(pk1)
    pokemonList.add(pk2)
    pokemonList.add(pk3)
    pokemonList.add(pk4)
    pokemonList.add(pk5)
    pokemonList.add(pk6)
    pokemonList.add(pk7)

    return pokemonList
}