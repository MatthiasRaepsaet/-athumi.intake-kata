package be.athumi.service

import be.athumi.Wine

class EcoWineStrategy : WineAssessmentStrategy{
    override fun assessWine(wine: Wine) {
        if(wine.price < 100){
            if(wine.expiresInYears < 0) {
                wine.price -= 4
            } else {
                wine.price -= 2
            }
        }

        if(wine.price < 0) {
            wine.price = 0
        }

        wine.expiresInYears -= 1
    }
}