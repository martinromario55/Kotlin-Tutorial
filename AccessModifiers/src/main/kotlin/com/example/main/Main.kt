package com.example.main

//import com.example.classes.Team
//import com.example.classes.Player
//import com.example.classes.CounterStrikePlayer
//import com.example.classes.FootballPlayer
//import com.example.classes.GamesPlayer

//  Import shortcut
import com.example.classes.*

fun main() {
val footballPlayer = Team<Player> ("Man United", mutableListOf<FootballPlayer>(FootballPlayer("Ronaldo"), FootballPlayer("Rooney")))

    val gamesTeam = Team<CounterStrikePlayer>("Games Team", mutableListOf<GamesPlayer>(GamesPlayer("Player 1")), GamesPlayer("Player 2"))
}

