package be.athumi.service

import be.athumi.Wine

class CellarWineStrategy : WineAssessmentStrategy {
    override fun assessWine(wine: Wine) {

        if(wine.price < 100){
            if(wine.expiresInYears < 0) {
                wine.price -= 2
            } else {
                wine.price -= 1
            }
        }

        if(wine.price < 0) {
            wine.price = 0
        }

        wine.expiresInYears -= 1
    }
}