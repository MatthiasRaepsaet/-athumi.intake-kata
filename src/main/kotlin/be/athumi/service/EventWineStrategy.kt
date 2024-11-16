package be.athumi.service

import be.athumi.Wine

class EventWineStrategy : WineAssessmentStrategy {
    override fun assessWine(wine: Wine) {
        if(wine.price < 100){
            when {
                wine.expiresInYears <= 0 -> wine.price = 0
                wine.expiresInYears <= 2 -> wine.price += 4
                wine.expiresInYears <= 7 -> wine.price += 2
                wine.expiresInYears > 7 -> wine.price += 1
            }
        }
        wine.expiresInYears -= 1
    }
}