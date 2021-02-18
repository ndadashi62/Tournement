package com.example.tournament

class Division(teamCount: Int = 8) {

    var devision=Division()

    val teamList:MutableList<Team> = ArrayList()


    fun getSuccessRate(): Int {
        var rates :Int = 0


        teamList.forEach { team -> rates.add(team.calculateSuccessRate()) }
        return rates
    }


}



