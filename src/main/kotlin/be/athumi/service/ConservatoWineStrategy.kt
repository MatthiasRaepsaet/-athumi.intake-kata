package be.athumi.service

import be.athumi.Wine

class ConservatoWineStrategy : WineAssessmentStrategy{
    override fun assessWine(wine: Wine) {
        wine.expiresInYears -= 1
        if(wine.price < 100){
            if (wine.expiresInYears >= 0){
                wine.price += 1
            } else {
                wine.price += 2
            }
        }

        if(wine.price < 0) {
            wine.price = 0
        }
    }
}