package com.example.tournament

import android.media.AsyncPlayer
import android.widget.Toast

class Team(var name :String, var playerCount: Int = 21) {

    val playerList: MutableList<Player> = ArrayList()

    init {
        for (playerCount in playerList){
           playerList.add(playerCount)
                 }
    }

    fun calculateSuccessRate(): Int {
        var rate :Int=0
        playerList.forEach { player -> rate+=player.successRate.toInt() }
        return rate
    }


}
