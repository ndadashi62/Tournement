package com.example.tournament

class Tournament(var devision: Division) {
    constructor() : this(Division())

    fun playRound(){
        var winner = ""
       var  highest = 0
        devision.teamList.forEach{team->
            if (team.calculateSuccessRate() > highest){
                highest = team.calculateSuccessRate()
                winner = team.name
            }
        }

    }

}
